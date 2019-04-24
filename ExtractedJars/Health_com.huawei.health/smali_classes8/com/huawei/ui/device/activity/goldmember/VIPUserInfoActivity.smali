.class public Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static b:Ljava/lang/String;

.field private static x:I

.field private static y:I


# instance fields
.field private A:Ljava/lang/String;

.field private B:I

.field private C:Ljava/lang/String;

.field private D:Ljava/lang/String;

.field private E:Landroid/widget/TextView;

.field private F:Landroid/widget/TextView;

.field private G:Landroid/content/Context;

.field private H:Landroid/widget/ImageView;

.field private I:Ljava/lang/String;

.field private J:Landroid/widget/TextView;

.field private K:Landroid/widget/TextView;

.field private L:Landroid/widget/ImageView;

.field private M:Landroid/widget/TextView;

.field private N:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

.field private O:Landroid/widget/ImageView;

.field private P:Landroid/widget/ImageView;

.field private Q:Landroid/widget/ImageView;

.field private R:Landroid/widget/ImageView;

.field private S:Landroid/widget/ImageView;

.field private T:Landroid/widget/TextView;

.field private U:Landroid/widget/TextView;

.field private V:Landroid/os/Handler;

.field private W:Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;

.field private X:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field a:J

.field private c:Landroid/widget/LinearLayout;

.field d:Lo/eoe;

.field e:Ljava/lang/String;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/LinearLayout;

.field private j:J

.field private k:Landroid/widget/LinearLayout;

.field private l:Landroid/widget/LinearLayout;

.field private m:Landroid/widget/ImageView;

.field private n:Landroid/widget/LinearLayout;

.field private o:Ljava/lang/String;

.field private p:Landroid/graphics/Bitmap;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Lcom/huawei/up/model/UserInfomation;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:I

.field private w:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

.field private z:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 65
    const-string v0, "VIPUserInfoActivity"

    sput-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    .line 114
    const v0, 0x5265c00

    sput v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->x:I

    .line 116
    const/16 v0, 0x1e

    sput v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->y:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 86
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->s:Lcom/huawei/up/model/UserInfomation;

    .line 124
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->j:J

    .line 130
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->I:Ljava/lang/String;

    .line 182
    new-instance v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$3;-><init>(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->V:Landroid/os/Handler;

    .line 227
    new-instance v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$5;-><init>(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->X:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 245
    new-instance v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;-><init>(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->W:Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->A:Ljava/lang/String;

    return-object p1
.end method

.method private a()V
    .locals 5

    .line 330
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initView():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_vip_member_user_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->setContentView(I)V

    .line 333
    sget v0, Lcom/huawei/ui/device/R$id;->main_sns_Member_user_head_img:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->m:Landroid/widget/ImageView;

    .line 335
    sget v0, Lcom/huawei/ui/device/R$id;->icon_vip_gold_imageView:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->H:Landroid/widget/ImageView;

    .line 337
    sget v0, Lcom/huawei/ui/device/R$id;->userinfor_Member_expired_reminder_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->n:Landroid/widget/LinearLayout;

    .line 339
    sget v0, Lcom/huawei/ui/device/R$id;->member_Free_Maintenance_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->c:Landroid/widget/LinearLayout;

    .line 341
    sget v0, Lcom/huawei/ui/device/R$id;->member_Service_hotline_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->k:Landroid/widget/LinearLayout;

    .line 343
    sget v0, Lcom/huawei/ui/device/R$id;->member_FreeCleaning_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->h:Landroid/widget/LinearLayout;

    .line 345
    sget v0, Lcom/huawei/ui/device/R$id;->member_Free_repair_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->i:Landroid/widget/LinearLayout;

    .line 347
    sget v0, Lcom/huawei/ui/device/R$id;->member_Free_Guarantee_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->f:Landroid/widget/LinearLayout;

    .line 349
    sget v0, Lcom/huawei/ui/device/R$id;->member_Free_Equipment_guarantee_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->g:Landroid/widget/LinearLayout;

    .line 351
    sget v0, Lcom/huawei/ui/device/R$id;->main_sns_Member_RelativeLayout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->l:Landroid/widget/LinearLayout;

    .line 354
    sget v0, Lcom/huawei/ui/device/R$id;->member_Free_upgrade_TextView:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->r:Landroid/widget/TextView;

    .line 356
    sget v0, Lcom/huawei/ui/device/R$id;->member_Free_upgrade_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->z:Landroid/widget/TextView;

    .line 357
    sget v0, Lcom/huawei/ui/device/R$id;->main_sns_Member_user_name:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->t:Landroid/widget/TextView;

    .line 358
    sget v0, Lcom/huawei/ui/device/R$id;->userinfor_Member_expired_reminder:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->q:Landroid/widget/TextView;

    .line 359
    sget v0, Lcom/huawei/ui/device/R$id;->member_Validity_period:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->u:Landroid/widget/TextView;

    .line 365
    sget v0, Lcom/huawei/ui/device/R$id;->member_Service_hotline_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->E:Landroid/widget/TextView;

    .line 366
    sget v0, Lcom/huawei/ui/device/R$id;->member_Free_repair_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->F:Landroid/widget/TextView;

    .line 367
    sget v0, Lcom/huawei/ui/device/R$id;->member_FreeCleaning_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->M:Landroid/widget/TextView;

    .line 368
    sget v0, Lcom/huawei/ui/device/R$id;->member_Free_Equipment_guarantee_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->K:Landroid/widget/TextView;

    .line 369
    sget v0, Lcom/huawei/ui/device/R$id;->member_Free_Guarantee_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->J:Landroid/widget/TextView;

    .line 370
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 374
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 378
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 379
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xa

    if-ne v1, v0, :cond_0

    .line 380
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current device is LEO !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 384
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 385
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 387
    :goto_0
    sget v0, Lcom/huawei/ui/device/R$id;->vip_member_img0:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->L:Landroid/widget/ImageView;

    .line 388
    sget v0, Lcom/huawei/ui/device/R$id;->vip_member_img1:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->O:Landroid/widget/ImageView;

    .line 389
    sget v0, Lcom/huawei/ui/device/R$id;->vip_member_img2:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->R:Landroid/widget/ImageView;

    .line 390
    sget v0, Lcom/huawei/ui/device/R$id;->vip_member_img3:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->S:Landroid/widget/ImageView;

    .line 391
    sget v0, Lcom/huawei/ui/device/R$id;->vip_member_img4:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->Q:Landroid/widget/ImageView;

    .line 392
    sget v0, Lcom/huawei/ui/device/R$id;->vip_member_img5:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->P:Landroid/widget/ImageView;

    .line 393
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->G:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 394
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->L:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_enter_left_pressed:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->O:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_enter_left_pressed:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 396
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->R:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_enter_left_pressed:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 397
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_enter_left_pressed:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 398
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->Q:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_enter_left_pressed:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 399
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->P:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_enter_left_pressed:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 401
    :cond_1
    return-void
.end method

.method private a(I)V
    .locals 5

    .line 661
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter goToUserRights():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 663
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 664
    const-class v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 665
    invoke-virtual {v4, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 666
    invoke-virtual {p0, v4}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->startActivity(Landroid/content/Intent;)V

    .line 667
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->e()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->p:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 64
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->I:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->k()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;I)I
    .locals 0

    .line 64
    iput p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->B:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->D:Ljava/lang/String;

    return-object p1
.end method

.method private c()V
    .locals 4

    .line 314
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter queryMemberStatus():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$4;-><init>(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 325
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 327
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->g()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;I)I
    .locals 0

    .line 64
    iput p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->v:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->N:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/up/model/UserInfomation;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->s:Lcom/huawei/up/model/UserInfomation;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->o:Ljava/lang/String;

    return-object p1
.end method

.method private d()V
    .locals 4

    .line 405
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter upDataUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->p:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 409
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->m:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 412
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->s:Lcom/huawei/up/model/UserInfomation;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 413
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUserInfo is null !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    return-void

    .line 416
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->s:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 417
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mUserName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->s:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v3}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->s:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v1}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 420
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->t:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 422
    :goto_0
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "levelName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->D:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";levelIconUrl =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->A:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->A:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 425
    invoke-static {p0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->H:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    goto :goto_1

    .line 428
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->H:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->icon_vip_gold:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 430
    :goto_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->h()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->C:Ljava/lang/String;

    return-object p1
.end method

.method private e()V
    .locals 9

    .line 434
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter upDataMemberExpired():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    iget v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->v:I

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->f()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 437
    :cond_0
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "member is Ordinary"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 439
    return-void

    .line 441
    :cond_1
    new-instance v5, Landroid/text/SpannableString;

    sget v0, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_valid_to:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->I:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 442
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->f()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 441
    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 443
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 445
    iget-wide v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->j:J

    iget-wide v2, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->a:J

    sub-long/2addr v0, v2

    sget v2, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->x:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    long-to-int v6, v0

    .line 446
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "expiredDay"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    sget v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->y:I

    if-gt v6, v0, :cond_3

    .line 449
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 450
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$plurals;->IDS_main_sns_member_surplus_time:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->I:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_surplus_time_less_than_one_day:I

    .line 452
    invoke-virtual {p0, v3}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 450
    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 453
    new-instance v7, Landroid/text/SpannableString;

    invoke-direct {v7, v8}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 454
    goto :goto_0

    .line 455
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$plurals;->IDS_main_sns_member_surplus_time:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->I:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 456
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 455
    invoke-virtual {v0, v1, v6, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 457
    new-instance v7, Landroid/text/SpannableString;

    invoke-direct {v7, v8}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 459
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 460
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 462
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->l:Landroid/widget/LinearLayout;

    const/high16 v1, 0x40e00000    # 7.0f

    invoke-virtual {p0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b(F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 463
    goto :goto_1

    .line 464
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->l:Landroid/widget/LinearLayout;

    const/high16 v1, 0x41980000    # 19.0f

    invoke-virtual {p0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b(F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 467
    :goto_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->d()V

    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Landroid/os/Handler;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->V:Landroid/os/Handler;

    return-object v0
.end method

.method private f()Ljava/lang/String;
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x3
    .end annotation

    .line 518
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getExpireTime():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 519
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->e:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 520
    const-string v0, ""

    return-object v0

    .line 523
    :cond_0
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy/MM/dd"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 526
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->e:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    .line 527
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->j:J

    .line 529
    iget-wide v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->j:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 530
    const/4 v0, 0x0

    return-object v0

    .line 533
    :cond_1
    const v6, 0x10014

    .line 538
    :try_start_1
    invoke-static {v5, v6}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    return-object v0

    .line 539
    :catch_0
    move-exception v5

    .line 540
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 541
    const-string v0, ""

    return-object v0

    .line 542
    :catch_1
    move-exception v5

    .line 543
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    const-string v0, ""

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Lcom/huawei/up/model/UserInfomation;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->s:Lcom/huawei/up/model/UserInfomation;

    return-object v0
.end method

.method private g()V
    .locals 5

    .line 471
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter upDataMemberFreeUp():userBand = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->I:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "->intentLevel="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->C:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    const/4 v4, 0x0

    .line 473
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 474
    new-instance v4, Landroid/text/SpannableString;

    sget v0, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_to_upgrade:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->I:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->C:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 475
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->i()V

    .line 476
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->z:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_user_free_upgrade:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 477
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 478
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Landroid/content/Context;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->G:Landroid/content/Context;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 495
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter updateServiceArea():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->E:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 498
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->F:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_number_of_times:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 499
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->M:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_twice:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 500
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->K:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 501
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->J:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 502
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->o:Ljava/lang/String;

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 506
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter upDataAfterReceiving():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->E:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_upgrade_after_receiving:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->F:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_upgrade_after_receiving:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 509
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->M:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_upgrade_after_receiving:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 510
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->K:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_upgrade_after_receiving:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 511
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->J:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_upgrade_after_receiving:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 512
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Landroid/graphics/Bitmap;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->p:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private k()V
    .locals 4

    .line 482
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter receiveNewRights():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 484
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->r:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_using_new_interests:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 485
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->z:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_receive_more_rights_and_interests:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 486
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->E:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 487
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->F:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_number_of_times:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->M:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_upgrade_after_receiving:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->K:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_upgrade_after_receiving:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->J:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_upgrade_after_receiving:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 491
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)I
    .locals 1

    .line 64
    iget v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->v:I

    return v0
.end method

.method static synthetic m(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)I
    .locals 1

    .line 64
    iget v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->B:I

    return v0
.end method

.method private m()V
    .locals 8

    .line 671
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showUpgradeDialog():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 672
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b(Ljava/lang/Boolean;)V

    .line 674
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->G:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 675
    sget v0, Lcom/huawei/ui/device/R$layout;->dialog_upgrade_to_huawei_gold_member:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 677
    sget v0, Lcom/huawei/ui/device/R$id;->one_month_free:I

    invoke-static {v5, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->U:Landroid/widget/TextView;

    .line 678
    sget v0, Lcom/huawei/ui/device/R$id;->Member_Free_Extended_warranty:I

    invoke-static {v5, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->T:Landroid/widget/TextView;

    .line 680
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 681
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xa

    if-ne v1, v0, :cond_0

    .line 682
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current device is LEO !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->U:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 684
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->T:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 686
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->U:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 687
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->T:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 689
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->N:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 690
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showObtainFailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 691
    new-instance v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->G:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_upgrade_to_huawei_gold:I

    .line 692
    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(I)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v0

    .line 693
    invoke-virtual {v0, v5}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(Landroid/view/View;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_new_version_ok:I

    new-instance v2, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$10;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$10;-><init>(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V

    .line 694
    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->d(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$1;-><init>(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V

    .line 705
    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v7

    .line 714
    invoke-virtual {v7}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->e()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->N:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 715
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->N:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->show()V

    .line 717
    :cond_1
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->D:Ljava/lang/String;

    return-object v0
.end method

.method private n()Z
    .locals 4

    .line 601
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter isFreeActivation():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    iget v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->B:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 604
    const/4 v0, 0x1

    return v0

    .line 606
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic o(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->A:Ljava/lang/String;

    return-object v0
.end method

.method private o()V
    .locals 5

    .line 611
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter gotoUpgrade():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->w:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    if-eqz v0, :cond_0

    .line 613
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->w:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->dismiss()V

    .line 615
    :cond_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 616
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 617
    const-class v0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 618
    invoke-virtual {p0, v4}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->startActivity(Landroid/content/Intent;)V

    .line 619
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->X:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private p()V
    .locals 6

    .line 648
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter callHotline():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 649
    const-string v4, ""

    .line 650
    iget v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->v:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    .line 651
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->G:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_service_call_number_item_1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 653
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->G:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_service_call_number_item_2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 656
    :goto_0
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.intent.action.DIAL"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tel:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 657
    invoke-virtual {p0, v5}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->startActivity(Landroid/content/Intent;)V

    .line 658
    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->o()V

    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->N:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->W:Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;

    return-object v0
.end method


# virtual methods
.method public b(F)I
    .locals 3

    .line 723
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 724
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public b(Ljava/lang/Boolean;)V
    .locals 4

    .line 727
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter isClickable():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 729
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->k:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 730
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 731
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->f:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 732
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->g:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 733
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->h:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 734
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 550
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onClick():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 552
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 553
    sget v0, Lcom/huawei/ui/device/R$id;->member_Free_Maintenance_layout:I

    if-ne v4, v0, :cond_0

    .line 554
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->o()V

    goto/16 :goto_0

    .line 557
    :cond_0
    sget v0, Lcom/huawei/ui/device/R$id;->member_Service_hotline_layout:I

    if-ne v4, v0, :cond_2

    .line 558
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->v:I

    const/4 v1, 0x3

    if-ge v0, v1, :cond_1

    .line 559
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->m()V

    goto/16 :goto_0

    .line 561
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->p()V

    goto :goto_0

    .line 565
    :cond_2
    sget v0, Lcom/huawei/ui/device/R$id;->member_Free_repair_layout:I

    if-ne v4, v0, :cond_4

    .line 566
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->v:I

    const/4 v1, 0x3

    if-ge v0, v1, :cond_3

    .line 567
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->m()V

    goto :goto_0

    .line 569
    :cond_3
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->a(I)V

    goto :goto_0

    .line 573
    :cond_4
    sget v0, Lcom/huawei/ui/device/R$id;->member_FreeCleaning_layout:I

    if-ne v4, v0, :cond_6

    .line 574
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->n()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 575
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->m()V

    goto :goto_0

    .line 577
    :cond_5
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->a(I)V

    goto :goto_0

    .line 581
    :cond_6
    sget v0, Lcom/huawei/ui/device/R$id;->member_Free_Equipment_guarantee_layout:I

    if-ne v4, v0, :cond_8

    .line 582
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->n()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 583
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->m()V

    goto :goto_0

    .line 585
    :cond_7
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->a(I)V

    goto :goto_0

    .line 589
    :cond_8
    sget v0, Lcom/huawei/ui/device/R$id;->member_Free_Guarantee_layout:I

    if-ne v4, v0, :cond_a

    .line 590
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->n()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 591
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->m()V

    goto :goto_0

    .line 593
    :cond_9
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->a(I)V

    .line 597
    :cond_a
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 174
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 175
    iput-object p0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->G:Landroid/content/Context;

    .line 177
    new-instance v0, Lo/eoe;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->G:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eoe;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->d:Lo/eoe;

    .line 179
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->a()V

    .line 180
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 623
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onDestroy():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 625
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 626
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->V:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 627
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->V:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 628
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->V:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 629
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->V:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 630
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->V:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 631
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->V:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 632
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->V:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 634
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->p:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 635
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 636
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 637
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->p:Landroid/graphics/Bitmap;

    .line 640
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->N:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->N:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 641
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->N:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->dismiss()V

    .line 642
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->N:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 644
    :cond_2
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 220
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onResume():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 224
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->c()V

    .line 225
    return-void
.end method
