.class Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/tauth/IUiListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/connect/auth/AuthAgent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "FeedConfirmListener"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$ButtonListener;
    }
.end annotation


# instance fields
.field a:Lcom/tencent/tauth/IUiListener;

.field final synthetic b:Lcom/tencent/connect/auth/AuthAgent;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/auth/AuthAgent;Lcom/tencent/tauth/IUiListener;)V
    .locals 1

    .line 478
    iput-object p1, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 474
    const-string v0, "sendinstall"

    iput-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->c:Ljava/lang/String;

    .line 475
    const-string v0, "installwording"

    iput-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->d:Ljava/lang/String;

    .line 476
    const-string v0, "http://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi"

    iput-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->e:Ljava/lang/String;

    .line 479
    iput-object p2, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;

    .line 480
    return-void
.end method

.method private a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 9

    .line 599
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    .line 600
    invoke-virtual {p2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    .line 602
    const/4 v3, 0x0

    .line 604
    :try_start_0
    invoke-virtual {v2, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v4

    .line 605
    if-nez v4, :cond_0

    .line 606
    const/4 v0, 0x0

    return-object v0

    .line 608
    :cond_0
    const-string v0, ".9.png"

    :try_start_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-eqz v0, :cond_2

    .line 609
    const/4 v5, 0x0

    .line 611
    :try_start_2
    invoke-static {v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    move-object v5, v0

    .line 614
    goto :goto_0

    .line 612
    :catch_0
    move-exception v6

    .line 613
    :try_start_3
    invoke-virtual {v6}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 615
    :goto_0
    if-eqz v5, :cond_1

    .line 616
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object v6

    .line 617
    invoke-static {v6}, Landroid/graphics/NinePatch;->isNinePatchChunk([B)Z

    move-result v7

    .line 618
    new-instance v8, Landroid/graphics/drawable/NinePatchDrawable;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    const/4 v1, 0x0

    invoke-direct {v8, v5, v6, v0, v1}, Landroid/graphics/drawable/NinePatchDrawable;-><init>(Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 619
    move-object v3, v8

    .line 620
    goto :goto_1

    .line 621
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 623
    :goto_1
    goto :goto_2

    .line 624
    :cond_2
    :try_start_4
    invoke-static {v4, p1}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v3, v0

    .line 625
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 632
    :goto_2
    goto :goto_3

    .line 629
    :catch_1
    move-exception v4

    .line 631
    invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V

    .line 633
    :goto_3
    return-object v3
.end method

.method private a(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/view/View;
    .locals 33

    .line 638
    new-instance v5, Landroid/util/DisplayMetrics;

    invoke-direct {v5}, Landroid/util/DisplayMetrics;-><init>()V

    .line 639
    const-string v0, "window"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/WindowManager;

    .line 640
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 641
    iget v7, v5, Landroid/util/DisplayMetrics;->density:F

    .line 643
    new-instance v8, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p1

    invoke-direct {v8, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 646
    new-instance v9, Landroid/widget/ImageView;

    move-object/from16 v0, p1

    invoke-direct {v9, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 647
    move-object/from16 v0, p2

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 648
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 649
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setId(I)V

    .line 651
    const/high16 v0, 0x42700000    # 60.0f

    mul-float/2addr v0, v7

    float-to-int v10, v0

    .line 652
    const/high16 v0, 0x42700000    # 60.0f

    mul-float/2addr v0, v7

    float-to-int v11, v0

    .line 653
    const/high16 v0, 0x41600000    # 14.0f

    mul-float/2addr v0, v7

    float-to-int v12, v0

    .line 654
    const/high16 v0, 0x41900000    # 18.0f

    mul-float/2addr v0, v7

    float-to-int v13, v0

    .line 655
    const/high16 v0, 0x40c00000    # 6.0f

    mul-float/2addr v0, v7

    float-to-int v14, v0

    .line 656
    const/high16 v0, 0x41900000    # 18.0f

    mul-float/2addr v0, v7

    float-to-int v15, v0

    .line 657
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    move v1, v10

    move v2, v11

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    move-object/from16 v16, v0

    .line 658
    move-object/from16 v0, v16

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 659
    move-object/from16 v0, v16

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v13, v14, v15}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 661
    move-object/from16 v0, v16

    invoke-virtual {v8, v9, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 664
    new-instance v0, Landroid/widget/TextView;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v17, v0

    .line 665
    move-object/from16 v0, v17

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 666
    move-object/from16 v0, v17

    const/high16 v1, 0x41600000    # 14.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 667
    move-object/from16 v0, v17

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 670
    move-object/from16 v0, v17

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 671
    move-object/from16 v0, v17

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 672
    move-object/from16 v0, v17

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLines(I)V

    .line 673
    move-object/from16 v0, v17

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setId(I)V

    .line 674
    const/high16 v0, 0x43390000    # 185.0f

    mul-float/2addr v0, v7

    float-to-int v0, v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 675
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    move-object/from16 v18, v0

    .line 676
    move-object/from16 v0, v18

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 677
    move-object/from16 v0, v18

    const/4 v1, 0x6

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 678
    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr v0, v7

    float-to-int v14, v0

    .line 679
    const/high16 v0, 0x40a00000    # 5.0f

    mul-float/2addr v0, v7

    float-to-int v0, v0

    move-object/from16 v1, v18

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v0, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 680
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v8, v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 683
    new-instance v0, Landroid/view/View;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    move-object/from16 v19, v0

    .line 684
    const/16 v0, 0xd6

    const/16 v1, 0xd6

    const/16 v2, 0xd6

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 685
    move-object/from16 v0, v19

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 686
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    move-object/from16 v20, v0

    .line 687
    move-object/from16 v0, v20

    const/4 v1, 0x3

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 688
    const/4 v13, 0x0

    .line 689
    move-object/from16 v0, v20

    const/4 v1, 0x5

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 690
    move-object/from16 v0, v20

    const/4 v1, 0x7

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 691
    const/high16 v0, 0x41400000    # 12.0f

    mul-float/2addr v0, v7

    float-to-int v0, v0

    move-object/from16 v1, v20

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v13, v0}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 692
    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v8, v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 695
    new-instance v0, Landroid/widget/LinearLayout;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    move-object/from16 v21, v0

    .line 696
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    move-object/from16 v22, v0

    .line 697
    move-object/from16 v0, v22

    const/4 v1, 0x5

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 698
    move-object/from16 v0, v22

    const/4 v1, 0x7

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 699
    move-object/from16 v0, v22

    const/4 v1, 0x3

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 701
    new-instance v0, Landroid/widget/Button;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    move-object/from16 v23, v0

    .line 702
    const-string v0, "\u8df3\u8fc7"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 703
    const-string v0, "buttonNegt.png"

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v1, v0, v2}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v24

    .line 704
    move-object/from16 v0, v23

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 705
    const/16 v0, 0x24

    const/16 v1, 0x61

    const/16 v2, 0x83

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setTextColor(I)V

    .line 706
    move-object/from16 v0, v23

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextSize(F)V

    .line 707
    move-object/from16 v0, v23

    move-object/from16 v1, p5

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 708
    move-object/from16 v0, v23

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setId(I)V

    .line 709
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v1, 0x42340000    # 45.0f

    mul-float/2addr v1, v7

    float-to-int v2, v1

    const/4 v1, 0x0

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object/from16 v25, v0

    .line 710
    const/high16 v0, 0x41600000    # 14.0f

    mul-float/2addr v0, v7

    float-to-int v0, v0

    move-object/from16 v1, v25

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 711
    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, v7

    float-to-int v0, v0

    move-object/from16 v1, v25

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 712
    const/high16 v0, 0x3f800000    # 1.0f

    move-object/from16 v1, v25

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 713
    move-object/from16 v0, v21

    move-object/from16 v1, v23

    move-object/from16 v2, v25

    invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 715
    new-instance v0, Landroid/widget/Button;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    move-object/from16 v26, v0

    .line 716
    const-string v0, "\u786e\u5b9a"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 717
    move-object/from16 v0, v26

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextSize(F)V

    .line 718
    const/16 v0, 0xff

    const/16 v1, 0xff

    const/16 v2, 0xff

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setTextColor(I)V

    .line 719
    const-string v0, "buttonPost.png"

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v1, v0, v2}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v27

    .line 720
    move-object/from16 v0, v26

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 721
    move-object/from16 v0, v26

    move-object/from16 v1, p4

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 722
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v1, 0x42340000    # 45.0f

    mul-float/2addr v1, v7

    float-to-int v2, v1

    const/4 v1, 0x0

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object/from16 v28, v0

    .line 723
    const/high16 v0, 0x3f800000    # 1.0f

    move-object/from16 v1, v28

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 724
    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, v7

    float-to-int v0, v0

    move-object/from16 v1, v28

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 725
    move-object/from16 v0, v21

    move-object/from16 v1, v26

    move-object/from16 v2, v28

    invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 731
    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-virtual {v8, v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 766
    const v0, 0x438b8000    # 279.0f

    mul-float/2addr v0, v7

    float-to-int v1, v0

    move/from16 v29, v1

    .line 767
    const/high16 v0, 0x43230000    # 163.0f

    mul-float/2addr v0, v7

    float-to-int v1, v0

    move/from16 v30, v1

    .line 768
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    move/from16 v1, v29

    move/from16 v2, v30

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    move-object/from16 v31, v0

    .line 770
    const/high16 v0, 0x41600000    # 14.0f

    mul-float/2addr v0, v7

    float-to-int v0, v0

    const/high16 v1, 0x41400000    # 12.0f

    mul-float/2addr v1, v7

    float-to-int v1, v1

    const/high16 v2, 0x41400000    # 12.0f

    mul-float/2addr v2, v7

    float-to-int v2, v2

    const/4 v3, 0x0

    invoke-virtual {v8, v0, v3, v1, v2}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    .line 771
    move-object/from16 v0, v31

    invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 772
    const/16 v0, 0xf7

    const/16 v1, 0xfb

    const/16 v2, 0xf7

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 775
    new-instance v0, Landroid/graphics/drawable/PaintDrawable;

    const/16 v1, 0xf7

    const/16 v2, 0xfb

    const/16 v3, 0xf7

    invoke-static {v1, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/PaintDrawable;-><init>(I)V

    move-object/from16 v32, v0

    .line 776
    const/high16 v0, 0x40a00000    # 5.0f

    mul-float/2addr v0, v7

    move-object/from16 v1, v32

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/PaintDrawable;->setCornerRadius(F)V

    .line 777
    move-object/from16 v0, v32

    invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 778
    return-object v8
.end method

.method private a(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/Object;)V
    .locals 15

    .line 524
    new-instance v6, Landroid/app/Dialog;

    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->e(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 525
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 527
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->e(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    .line 528
    const/4 v8, 0x0

    .line 529
    const/4 v9, 0x0

    .line 531
    :try_start_0
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->e(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v8, v0

    .line 535
    goto :goto_0

    .line 532
    :catch_0
    move-exception v10

    .line 534
    invoke-virtual {v10}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    .line 539
    :goto_0
    if-eqz v8, :cond_0

    .line 540
    iget-object v0, v8, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0, v7}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    .line 543
    :cond_0
    new-instance v10, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    invoke-direct {v10, p0, v6, v0, v1}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;-><init>(Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;Landroid/app/Dialog;Lcom/tencent/tauth/IUiListener;Ljava/lang/Object;)V

    .line 558
    new-instance v11, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$2;

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    invoke-direct {v11, p0, v6, v0, v1}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$2;-><init>(Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;Landroid/app/Dialog;Lcom/tencent/tauth/IUiListener;Ljava/lang/Object;)V

    .line 574
    new-instance v12, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v12}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    .line 575
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Landroid/graphics/drawable/ColorDrawable;->setAlpha(I)V

    .line 576
    invoke-virtual {v6}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 577
    move-object v0, p0

    iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v1}, Lcom/tencent/connect/auth/AuthAgent;->e(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;

    move-result-object v1

    move-object v2, v9

    move-object/from16 v3, p1

    move-object v4, v10

    move-object v5, v11

    invoke-direct/range {v0 .. v5}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object v13

    .line 578
    invoke-virtual {v6, v13}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 579
    new-instance v14, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$3;

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    invoke-direct {v14, p0, v0, v1}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$3;-><init>(Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;Lcom/tencent/tauth/IUiListener;Ljava/lang/Object;)V

    .line 590
    invoke-virtual {v6, v14}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 591
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->e(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->e(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 592
    invoke-virtual {v6}, Landroid/app/Dialog;->show()V

    .line 595
    :cond_1
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 7

    .line 783
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->g(Lcom/tencent/connect/auth/AuthAgent;)Landroid/os/Bundle;

    move-result-object v6

    .line 784
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->h(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v1}, Lcom/tencent/connect/auth/AuthAgent;->e(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;

    move-result-object v1

    const-string v2, "http://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi"

    move-object v3, v6

    const-string v4, "POST"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 785
    return-void
.end method

.method public onCancel()V
    .locals 1

    .line 798
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;

    if-eqz v0, :cond_0

    .line 799
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V

    .line 801
    :cond_0
    return-void
.end method

.method public onComplete(Ljava/lang/Object;)V
    .locals 7

    .line 484
    if-eqz p1, :cond_2

    .line 485
    move-object v3, p1

    check-cast v3, Lorg/json/JSONObject;

    .line 487
    if-eqz v3, :cond_2

    .line 488
    const/4 v4, 0x0

    .line 489
    const-string v5, ""

    .line 491
    const-string v0, "sendinstall"

    :try_start_0
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v4, v0

    .line 492
    const-string v0, "installwording"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 495
    goto :goto_1

    .line 493
    :catch_0
    move-exception v6

    .line 494
    const-string v0, "FeedConfirm"

    const-string v1, "There is no value for sendinstall."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    :goto_1
    invoke-static {v5}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 498
    const-string v0, "TAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " WORDING = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "xx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 499
    if-eqz v4, :cond_1

    .line 500
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 501
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;

    invoke-direct {p0, v5, v0, p1}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/Object;)V

    .line 502
    return-void

    .line 506
    :cond_1
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;

    if-eqz v0, :cond_2

    .line 507
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, p1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V

    .line 511
    :cond_2
    return-void
.end method

.method public onError(Lcom/tencent/tauth/UiError;)V
    .locals 1

    .line 791
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;

    if-eqz v0, :cond_0

    .line 792
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, p1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 794
    :cond_0
    return-void
.end method
