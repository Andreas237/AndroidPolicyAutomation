.class public Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$d;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:I

.field private c:Landroid/content/Context;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/ImageView;

.field private k:Lo/egd;

.field private l:Landroid/widget/ImageView;

.field private m:Lcom/huawei/hihealth/HiUserInfo;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/LinearLayout;

.field private p:Landroid/widget/TextView;

.field private s:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 64
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    .line 83
    new-instance v0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$d;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$d;-><init>(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->s:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;)Landroid/os/Handler;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->s:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;Lcom/huawei/hihealth/HiUserInfo;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->m:Lcom/huawei/hihealth/HiUserInfo;

    return-object p1
.end method

.method private a()V
    .locals 7

    .line 197
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->o:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/pluginachievement/R$id;->achieve_pb_image_type:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 198
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    invoke-static {v0}, Lo/dzr;->h(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 199
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->o:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/pluginachievement/R$id;->achieve_pb_img_text:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 200
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    invoke-static {v0}, Lo/dzr;->f(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 202
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->o:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/pluginachievement/R$id;->achieve_pb_share_date:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 203
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->g:Ljava/lang/String;

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->o:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/pluginachievement/R$id;->achieve_pb_share_text:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 206
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->f:Ljava/lang/String;

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->o:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/pluginachievement/R$id;->achieve_breakdown_mgs_tiltle:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 209
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dzr;->b(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->o:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/pluginachievement/R$id;->nick_img:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->l:Landroid/widget/ImageView;

    .line 212
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->o:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/pluginachievement/R$id;->nick_name:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->p:Landroid/widget/TextView;

    .line 213
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 214
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b()V

    .line 216
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;Lcom/huawei/up/model/UserInfomation;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->a(Lcom/huawei/up/model/UserInfomation;)V

    return-void
.end method

.method private a(Lcom/huawei/up/model/UserInfomation;)V
    .locals 7

    .line 334
    const/4 v0, 0x0

    if-eq v0, p1, :cond_5

    .line 335
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "userinfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 336
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v4

    .line 337
    if-eqz v4, :cond_0

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 338
    :cond_0
    new-instance v5, Lcom/huawei/up/api/UpApi;

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/huawei/up/api/UpApi;-><init>(Landroid/content/Context;)V

    .line 339
    invoke-virtual {v5}, Lcom/huawei/up/api/UpApi;->getAccountName()Ljava/lang/String;

    move-result-object v6

    .line 340
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 341
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 343
    :cond_1
    goto :goto_0

    .line 344
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 348
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v5

    .line 349
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 350
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 351
    if-eqz v6, :cond_3

    .line 352
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->l:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 353
    return-void

    .line 356
    :cond_3
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b(Lcom/huawei/up/model/UserInfomation;)V

    .line 359
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess() btimap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    goto :goto_1

    .line 362
    :cond_4
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()! headImgPath is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_personal_head:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 366
    :goto_1
    goto :goto_2

    .line 367
    :cond_5
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()! userinfo is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    :goto_2
    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->m:Lcom/huawei/hihealth/HiUserInfo;

    return-object v0
.end method

.method private b()V
    .locals 6

    .line 225
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_app_third_login"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 226
    const-string v0, "1"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 227
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: isthirdlogin == 1 and return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->d()V

    .line 229
    return-void

    .line 231
    :cond_0
    new-instance v5, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$5;

    invoke-direct {v5, p0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$5;-><init>(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;)V

    .line 251
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/dnm;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 252
    return-void
.end method

.method private b(Lcom/huawei/up/model/UserInfomation;)V
    .locals 5

    .line 398
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v4

    .line 399
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 400
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "it\'s so terrible, as missing the headImage url, we can do nothing!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    return-void

    .line 403
    :cond_0
    return-void
.end method

.method private c()V
    .locals 3

    .line 147
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_pb_image_type:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    .line 148
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    invoke-static {v0}, Lo/dzr;->h(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 149
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_pb_img_text:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 150
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    invoke-static {v0}, Lo/dzr;->f(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->f()V

    return-void
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 406
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 407
    :cond_0
    const-string v0, ""

    return-object v0

    .line 409
    :cond_1
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 410
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/photos/headimage/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v1, v4

    add-int/lit8 v1, v1, -0x1

    aget-object v1, v4, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 411
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 412
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 413
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getHeadImageFromLocal file.exists() yes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 415
    :cond_2
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getHeadImageFromLocal file.exists() no"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/photos/headimage"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v7

    .line 417
    if-eqz v7, :cond_4

    array-length v0, v7

    if-lez v0, :cond_4

    .line 418
    const/4 v8, 0x0

    :goto_0
    array-length v0, v7

    if-ge v8, v0, :cond_3

    .line 419
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getHeadImageFromLocal files: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    aget-object v2, v7, v8

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 421
    :cond_3
    array-length v0, v7

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v7, v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    .line 422
    if-nez v5, :cond_4

    .line 423
    const-string v0, ""

    return-object v0

    .line 427
    :cond_4
    :goto_1
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getHeadImageFromLocal localpath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    return-object v5
.end method

.method private d()V
    .locals 2

    .line 256
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$2;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$2;-><init>(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 293
    return-void
.end method

.method private e()V
    .locals 7

    .line 98
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 99
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 100
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const-string v1, "intent is null"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->finish()V

    .line 102
    return-void

    .line 104
    :cond_0
    const-string v0, "dialogType"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    .line 105
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 106
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->finish()V

    .line 107
    return-void

    .line 109
    :cond_1
    const-string v0, "dialogValue"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 110
    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    .line 111
    const-string v4, ""

    .line 113
    :cond_2
    sget-object v0, Lo/dae;->aj:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->e(Ljava/lang/String;)V

    .line 114
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c()V

    .line 115
    const-string v0, "dialogDate"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v5

    .line 116
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enter initView mType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "value="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_pb_share_ll:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->o:Landroid/widget/LinearLayout;

    .line 119
    iput-object v4, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->f:Ljava/lang/String;

    .line 120
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_breakdown_mgs_tiltle:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->a:Landroid/widget/TextView;

    .line 121
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->d:Landroid/widget/TextView;

    .line 122
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_unit:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->e:Landroid/widget/TextView;

    .line 123
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->o:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_unit:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->n:Landroid/widget/TextView;

    .line 124
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_breakdown_dialog_date:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->h:Landroid/widget/TextView;

    .line 125
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_pb_dialog_share_button:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->k:Lo/egd;

    .line 126
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->k:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 127
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_breakdown_dialog_title_ImageView:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->i:Landroid/widget/ImageView;

    .line 128
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->i:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->a:Landroid/widget/TextView;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-static {v1, v2}, Lo/dzr;->b(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->g:Ljava/lang/String;

    .line 131
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->a()V

    .line 134
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    invoke-static {v0}, Lo/dzr;->b(I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 135
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->e:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 136
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->n:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 137
    :cond_3
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 138
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->e:Landroid/widget/TextView;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-static {v1, v2}, Lo/dzr;->a(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->n:Landroid/widget/TextView;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-static {v1, v2}, Lo/dzr;->a(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 141
    :cond_4
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->e:Landroid/widget/TextView;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-static {v1, v2}, Lo/dzr;->e(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->n:Landroid/widget/TextView;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-static {v1, v2}, Lo/dzr;->e(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 5

    .line 186
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 187
    const-string v0, "type"

    iget v1, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v3

    .line 189
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v4

    .line 190
    const/4 v0, 0x0

    invoke-virtual {v4, v3, p1, v2, v0}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 191
    return-void
.end method

.method private f()V
    .locals 7

    .line 372
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->m:Lcom/huawei/hihealth/HiUserInfo;

    if-nez v0, :cond_0

    .line 373
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: setUserNameFromLocal mHiUserInfo == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    return-void

    .line 376
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->m:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 379
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->m:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getHeadImgUrl()Ljava/lang/String;

    move-result-object v4

    .line 381
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: headImgPath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountfilepath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/photos/headimage"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    invoke-direct {p0, v4}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 384
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 385
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 387
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: setUserNameFromLocal headImgPath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    if-eqz v6, :cond_1

    .line 389
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->l:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 391
    :cond_1
    goto :goto_0

    .line 392
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_personal_head:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 393
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: setUserNameFromLocal() headImgPath is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    :goto_0
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 15

    .line 154
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_breakdown_dialog_title_ImageView:I

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 155
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->finish()V

    .line 157
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_pb_dialog_share_button:I

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_5

    .line 158
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const-string v1, "onClick"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dtm;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 160
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dzr;->b(Landroid/content/Context;)V

    .line 161
    return-void

    .line 163
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v11

    .line 164
    invoke-virtual {v11}, Lo/dth;->d()Lo/dti;

    move-result-object v12

    .line 165
    const/4 v0, 0x0

    if-eq v0, v12, :cond_4

    .line 166
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 167
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 169
    const-string v0, "pb"

    iget v1, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->o:Landroid/widget/LinearLayout;

    invoke-static {v0}, Lo/dxh;->a(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v14

    .line 172
    const/4 v0, 0x0

    if-eq v0, v14, :cond_3

    .line 173
    move-object v0, v12

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    move-object v5, v14

    sget-object v2, Lo/dae;->al:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v9

    move-object v10, v13

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-interface/range {v0 .. v10}, Lo/dti;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Ljava/util/Map;)V

    .line 174
    sget-object v0, Lo/dae;->al:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->e(Ljava/lang/String;)V

    .line 176
    :cond_3
    goto :goto_0

    .line 177
    :cond_4
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const-string v1, "adapter is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    :cond_5
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 86
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 87
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 88
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x8000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 90
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$layout;->achieve_report_message_dialog:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->setContentView(I)V

    .line 91
    iput-object p0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c:Landroid/content/Context;

    .line 92
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->e()V

    .line 93
    sget v0, Lcom/huawei/pluginachievement/R$anim;->fade_in:I

    sget v1, Lcom/huawei/pluginachievement/R$anim;->fade_out:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->overridePendingTransition(II)V

    .line 95
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 323
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 325
    return-void
.end method
