.class public Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity$b;
    }
.end annotation


# instance fields
.field private f:Lcom/huawei/health/sns/model/group/Group;

.field private g:Landroid/view/View;

.field private h:Landroid/widget/ImageView;

.field private k:Lo/bio;

.field private l:Lo/bmr;

.field private m:Landroid/widget/RelativeLayout;

.field private n:Landroid/os/Handler;

.field private o:Lo/bmr;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 183
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->k:Lo/bio;

    .line 188
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->f:Lcom/huawei/health/sns/model/group/Group;

    .line 193
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->h:Landroid/widget/ImageView;

    .line 198
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->g:Landroid/view/View;

    .line 203
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->m:Landroid/widget/RelativeLayout;

    .line 208
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->l:Lo/bmr;

    .line 213
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->o:Lo/bmr;

    .line 218
    new-instance v0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity$b;-><init>(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->n:Landroid/os/Handler;

    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 5

    .line 653
    const-string v0, "selectedId"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 654
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    .line 656
    new-instance v3, Lo/avb;

    invoke-direct {v3, p0}, Lo/avb;-><init>(Landroid/content/Context;)V

    .line 657
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v3, v0}, Lo/avb;->b(I)Landroid/net/Uri;

    move-result-object v4

    .line 658
    if-eqz v4, :cond_0

    .line 660
    invoke-direct {p0, v4}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->c(Landroid/net/Uri;)V

    .line 663
    :cond_0
    return-void
.end method

.method private a(Landroid/graphics/Bitmap;Z)V
    .locals 2

    .line 693
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->o()V

    .line 694
    new-instance v1, Lo/ats;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->n:Landroid/os/Handler;

    invoke-direct {v1, v0}, Lo/ats;-><init>(Landroid/os/Handler;)V

    .line 695
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->f:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1, v0, p1, p2}, Lo/ats;->b(Lcom/huawei/health/sns/model/group/Group;Landroid/graphics/Bitmap;Z)V

    .line 696
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->g()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;Ljava/lang/Object;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->e(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->f:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method private b()V
    .locals 6

    .line 360
    sget v0, Lcom/huawei/android/sns/R$id;->group_head_root:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->a:Landroid/widget/RelativeLayout;

    .line 362
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;-><init>(Lcom/huawei/health/sns/ui/base/SNSBaseActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 365
    sget v0, Lcom/huawei/android/sns/R$id;->image_head:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->h:Landroid/widget/ImageView;

    .line 366
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 368
    sget v0, Lcom/huawei/android/sns/R$id;->layout_headgroup:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->g:Landroid/view/View;

    .line 369
    sget v0, Lcom/huawei/android/sns/R$id;->check_pic_tip_container:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->m:Landroid/widget/RelativeLayout;

    .line 371
    sget v0, Lcom/huawei/android/sns/R$id;->btn_capture:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bmr;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->l:Lo/bmr;

    .line 372
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->l:Lo/bmr;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lo/bmr;->setOnTouchListenerWithAlpha(F)V

    .line 373
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->l:Lo/bmr;

    invoke-virtual {v0, p0}, Lo/bmr;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 375
    sget v0, Lcom/huawei/android/sns/R$id;->btn_select_pic:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bmr;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->o:Lo/bmr;

    .line 376
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->o:Lo/bmr;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lo/bmr;->setOnTouchListenerWithAlpha(F)V

    .line 377
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->o:Lo/bmr;

    invoke-virtual {v0, p0}, Lo/bmr;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 380
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->f:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 382
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->m:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 383
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->l:Lo/bmr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bmr;->setVisibility(I)V

    .line 384
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->o:Lo/bmr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bmr;->setVisibility(I)V

    .line 385
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_family_group_image:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 388
    :cond_0
    invoke-static {}, Lo/bom;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 390
    invoke-static {p0}, Lo/boi;->e(Landroid/app/Activity;)I

    move-result v4

    .line 391
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->g:Landroid/view/View;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 394
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->h:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 395
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 397
    invoke-static {p0}, Lo/bmo;->e(Landroid/content/Context;)I

    move-result v0

    invoke-static {p0}, Lo/bmo;->a(Landroid/content/Context;)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, v5, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 398
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 402
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->c()V

    .line 403
    return-void
.end method

.method private b(III)V
    .locals 1

    .line 707
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 710
    :sswitch_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_file_parse_error:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 711
    goto :goto_0

    .line 714
    :sswitch_1
    invoke-static {p2, p3}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 715
    .line 719
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1a1 -> :sswitch_0
        0x1a2 -> :sswitch_1
        0xaaa -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;III)V
    .locals 0

    .line 74
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->b(III)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 778
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 779
    const-string v0, "GROUP_IMAGE_REFRESH_ACTION"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 780
    const-string v0, "groupImageUrl"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 781
    const-string v0, "groupImageDownloadUrl"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 782
    invoke-static {v1}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 783
    return-void
.end method

.method private c()V
    .locals 3

    .line 467
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->m:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {p0}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->g:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 469
    :cond_0
    return-void

    .line 471
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 472
    invoke-static {p0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {p0, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    goto :goto_0

    :cond_2
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {p0, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    :goto_0
    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 473
    invoke-static {p0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {p0, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 474
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 476
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->f()V

    .line 477
    return-void
.end method

.method private c(Landroid/net/Uri;)V
    .locals 5

    .line 560
    new-instance v3, Landroid/content/Intent;

    const-string v0, "com.android.camera.action.CROP"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 561
    const-string v0, "image/*"

    invoke-virtual {v3, p1, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 563
    const-string v0, "crop"

    const-string v1, "true"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 566
    const-string v0, "aspectX"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 567
    const-string v0, "aspectY"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 570
    const-string v0, "outputX"

    const/16 v1, 0x12c

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 571
    const-string v0, "outputY"

    const/16 v1, 0x12c

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 572
    const-string v0, "return-data"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 573
    const-string v0, "noFaceDetection"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 576
    const-string v0, "outputX"

    const/16 v1, 0x438

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 577
    const-string v0, "outputY"

    const/16 v1, 0x438

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 578
    const-string v0, "scale"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 580
    const-string v0, "output"

    new-instance v1, Ljava/io/File;

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->k()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 582
    const-string v0, "outputFormat"

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v1}, Landroid/graphics/Bitmap$CompressFormat;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 583
    const-string v0, "return-data"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 586
    invoke-static {}, Lo/bom;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 588
    const-string v0, "com.android.gallery3d"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 592
    :cond_0
    const/4 v0, 0x4

    :try_start_0
    invoke-virtual {p0, v3, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 597
    goto :goto_0

    .line 594
    :catch_0
    move-exception v4

    .line 596
    const-string v0, "GroupHeadImageActivity"

    const-string v1, "crop picture not found "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 598
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->p()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->h:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;)Landroid/os/Handler;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->n:Landroid/os/Handler;

    return-object v0
.end method

.method private e()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .line 323
    invoke-static {}, Lo/bom;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 326
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x8000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 328
    sget v0, Lcom/huawei/android/sns/R$style;->sns_group_head_imageTheme:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->setTheme(I)V

    .line 330
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_image_detail_bg:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_0

    .line 341
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "androidhwext:style/Theme.Emui"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 342
    if-eqz v4, :cond_1

    .line 344
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->setTheme(I)V

    goto :goto_0

    .line 348
    :cond_1
    const v0, 0x103006e

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->setTheme(I)V

    .line 351
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v4

    .line 352
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 353
    return-void
.end method

.method private e(Ljava/lang/Object;)V
    .locals 2

    .line 672
    if-nez p1, :cond_0

    .line 674
    return-void

    .line 676
    :cond_0
    move-object v1, p1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 677
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->h:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 679
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 682
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->g()V

    .line 683
    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 768
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->f:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageUrl(Ljava/lang/String;)V

    .line 769
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->f:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0, p2}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageDownloadUrl(Ljava/lang/String;)V

    .line 770
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 771
    return-void
.end method

.method private g()V
    .locals 6

    .line 529
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    const-string v1, "sns_head.jpg"

    invoke-virtual {v0, v1}, Lo/bbh;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 530
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 532
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v4

    .line 533
    const-string v0, "GroupHeadImageActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteTempFile: Delete file result is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 535
    :cond_0
    new-instance v4, Ljava/io/File;

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->k()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 536
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 538
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v5

    .line 539
    const-string v0, "GroupHeadImageActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteTempFile: Delete tempCropFile result is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 541
    :cond_1
    return-void
.end method

.method private h()Ljava/io/File;
    .locals 2

    .line 521
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    const-string v1, "sns_head.jpg"

    invoke-virtual {v0, v1}, Lo/bbh;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private k()Ljava/lang/String;
    .locals 2

    .line 550
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    const-string v1, "sns_temp.jpg"

    invoke-virtual {v0, v1}, Lo/bbh;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private l()V
    .locals 3

    .line 790
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 791
    if-eqz v1, :cond_0

    .line 793
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 794
    if-eqz v2, :cond_0

    const-string v0, "group"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 796
    const-string v0, "group"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->f:Lcom/huawei/health/sns/model/group/Group;

    .line 799
    :cond_0
    return-void
.end method

.method private m()V
    .locals 5

    .line 803
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 804
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->h()Ljava/io/File;

    move-result-object v3

    .line 805
    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v4

    .line 806
    const-string v0, "output"

    invoke-virtual {v2, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 807
    const-string v0, "com.huawei.camera"

    const/4 v1, 0x1

    invoke-static {p0, v2, v0, v1}, Lo/bnx;->d(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;I)Z

    .line 808
    return-void
.end method

.method private n()V
    .locals 3

    .line 757
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->h:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->f:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->a(Landroid/widget/ImageView;J)V

    .line 758
    return-void
.end method

.method private o()V
    .locals 4

    .line 726
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->k:Lo/bio;

    if-nez v0, :cond_0

    .line 728
    new-instance v0, Lo/bio;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p0, v2, v1, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->k:Lo/bio;

    .line 730
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->k:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 731
    return-void
.end method

.method private p()V
    .locals 1

    .line 738
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->k:Lo/bio;

    if-eqz v0, :cond_0

    .line 740
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->k:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 742
    :cond_0
    return-void
.end method

.method private s()V
    .locals 1

    .line 843
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpk;->c()V

    .line 844
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 445
    :try_start_0
    new-instance v2, Landroid/util/DisplayMetrics;

    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    .line 446
    new-instance v3, Landroid/util/DisplayMetrics;

    invoke-direct {v3}, Landroid/util/DisplayMetrics;-><init>()V

    .line 447
    const-string v0, "window"

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/WindowManager;

    .line 448
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v5

    .line 449
    invoke-virtual {v5, v2}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 450
    invoke-virtual {v5, v3}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 452
    iget v0, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    iget v1, v2, Landroid/util/DisplayMetrics;->heightPixels:I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 454
    :catch_0
    move-exception v2

    .line 456
    const-string v0, "GroupHeadImageActivity"

    const-string v1, "isNavigationBottom() IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 458
    const/4 v0, 0x1

    return v0
.end method

.method public f()V
    .locals 6

    .line 416
    const/4 v4, 0x0

    .line 419
    iget v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->i:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 421
    invoke-static {p0}, Lo/boi;->e(Landroid/app/Activity;)I

    move-result v5

    .line 423
    invoke-static {p0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 426
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 428
    move v4, v5

    goto :goto_0

    .line 434
    :cond_0
    move v4, v5

    .line 437
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->g:Landroid/view/View;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 438
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 603
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 604
    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    .line 606
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 610
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->h()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->c(Landroid/net/Uri;)V

    .line 611
    goto :goto_1

    .line 615
    :pswitch_1
    :try_start_0
    invoke-direct {p0, p3}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->a(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 621
    goto :goto_1

    .line 617
    :catch_0
    move-exception v2

    .line 619
    const-string v0, "GroupHeadImageActivity"

    const-string v1, "GroupHeadImageActivity onActivityResult get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 620
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->finish()V

    .line 622
    goto :goto_1

    .line 624
    :pswitch_2
    if-eqz p3, :cond_2

    .line 626
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 627
    if-eqz v2, :cond_0

    .line 629
    const-string v0, "data"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/graphics/Bitmap;

    .line 630
    const/4 v0, 0x0

    invoke-direct {p0, v3, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->a(Landroid/graphics/Bitmap;Z)V

    .line 632
    :cond_0
    goto :goto_1

    .line 635
    :pswitch_3
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 637
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/boe;->b(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 638
    const/4 v0, 0x1

    invoke-direct {p0, v2, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->a(Landroid/graphics/Bitmap;Z)V

    .line 639
    goto :goto_1

    .line 642
    :goto_0
    goto :goto_1

    .line 647
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->g()V

    .line 649
    :cond_2
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 483
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->l:Lo/bmr;

    invoke-virtual {v1}, Lo/bmr;->getId()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 485
    invoke-static {}, Lo/brg;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 487
    const/4 v0, 0x4

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const-string v0, "android.permission.CAMERA"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    const-string v0, "android.permission.FLASHLIGHT"

    const/4 v1, 0x3

    aput-object v0, v2, v1

    .line 488
    invoke-static {p0, v2}, Lo/biq;->a(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 490
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 492
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_0

    .line 496
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->m()V

    .line 498
    :goto_0
    goto :goto_1

    .line 501
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->m()V

    goto :goto_1

    .line 505
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->o:Lo/bmr;

    invoke-virtual {v1}, Lo/bmr;->getId()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 507
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 508
    const-class v0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 509
    const-string v0, "isSingle"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 510
    const/4 v0, 0x3

    invoke-virtual {p0, v2, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 512
    :cond_3
    :goto_1
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 408
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 409
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->c()V

    .line 410
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 288
    sget v0, Lcom/huawei/android/sns/R$color;->sns_black_100_percent:I

    iput v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->b:I

    .line 290
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 293
    invoke-static {p0}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 295
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->setRequestedOrientation(I)V

    .line 298
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->l()V

    .line 300
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->f:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_1

    .line 302
    const-string v0, "GroupHeadImageActivity"

    const-string v1, "grpHeadImageActivity group is null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->finish()V

    .line 304
    return-void

    .line 307
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->e()V

    .line 309
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_group_head_image_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->setContentView(I)V

    .line 311
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->b()V

    .line 313
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->n()V

    .line 314
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 748
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->p()V

    .line 749
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 750
    return-void
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 850
    sget v0, Lcom/huawei/android/sns/R$array;->head_image_save_item:I

    new-instance v1, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity$4;-><init>(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;)V

    invoke-static {p0, v0, v1}, Lo/boj;->e(Landroid/app/Activity;ILo/boj$a;)V

    .line 860
    const/4 v0, 0x0

    return v0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    .line 813
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 815
    if-eqz p2, :cond_2

    if-eqz p3, :cond_2

    array-length v0, p3

    if-lez v0, :cond_2

    .line 817
    invoke-static {p3}, Lo/biq;->d([I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 819
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->m()V

    .line 820
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->s()V

    goto :goto_1

    .line 824
    :cond_0
    const/4 v2, 0x0

    :goto_0
    array-length v0, p2

    if-ge v2, v0, :cond_2

    .line 826
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    aget-object v1, p2, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    array-length v0, p3

    if-ge v2, v0, :cond_1

    aget v0, p3, v2

    if-nez v0, :cond_1

    .line 829
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->s()V

    .line 830
    goto :goto_1

    .line 824
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 836
    :cond_2
    :goto_1
    return-void
.end method
