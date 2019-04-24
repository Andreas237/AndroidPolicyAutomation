.class Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/HwBottomNavigationView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "BottomNavigationItemView"
.end annotation


# instance fields
.field private mActiveColor:I

.field private mChecked:Z

.field private mContainer:Landroid/widget/LinearLayout;

.field private mContent:Lhuawei/widget/HwTextView;

.field private mCurrentDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

.field private mDefaultColor:I

.field private mDirectionLand:Z

.field mEndRent:F

.field mHasMeasured:Z

.field private mHorizontalPadding:I

.field private mIndex:I

.field private mIsHasMessage:Z

.field private mItem:Landroid/view/MenuItem;

.field private mLandComplexDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

.field private mLandMinHeight:I

.field private mLandTextSize:I

.field private mMinTextSize:I

.field private mMsgBgColor:I

.field private mPaint:Landroid/graphics/Paint;

.field private mPortComplexDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

.field private mPortMinHeight:I

.field private mPortTextSize:I

.field private mRedDotRadius:I

.field private mStartImage:Landroid/widget/ImageView;

.field mStartRent:F

.field private mStepGranularity:I

.field private mTopImage:Landroid/widget/ImageView;

.field private mVerticalAddedPadding:I

.field private mVerticalPadding:I

.field final synthetic this$0:Lhuawei/widget/HwBottomNavigationView;


# direct methods
.method public constructor <init>(Lhuawei/widget/HwBottomNavigationView;Landroid/content/Context;Landroid/view/MenuItem;ZI)V
    .locals 4

    .line 617
    iput-object p1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->this$0:Lhuawei/widget/HwBottomNavigationView;

    .line 618
    invoke-direct {p0, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 619
    iput-object p3, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mItem:Landroid/view/MenuItem;

    .line 620
    sget v0, Lhuawei/widget/hwbottomnavigationview/R$layout;->bottomnav_item_layout:I

    invoke-static {p2, v0, p0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 621
    sget v0, Lhuawei/widget/hwbottomnavigationview/R$id;->content:I

    invoke-virtual {p0, v0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwTextView;

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContent:Lhuawei/widget/HwTextView;

    .line 622
    sget v0, Lhuawei/widget/hwbottomnavigationview/R$id;->topIcon:I

    invoke-virtual {p0, v0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mTopImage:Landroid/widget/ImageView;

    .line 623
    sget v0, Lhuawei/widget/hwbottomnavigationview/R$id;->startIcon:I

    invoke-virtual {p0, v0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mStartImage:Landroid/widget/ImageView;

    .line 624
    sget v0, Lhuawei/widget/hwbottomnavigationview/R$id;->container:I

    invoke-virtual {p0, v0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContainer:Landroid/widget/LinearLayout;

    .line 625
    new-instance v0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mItem:Landroid/view/MenuItem;

    invoke-interface {v1}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;-><init>(Lhuawei/widget/HwBottomNavigationView;Landroid/content/Context;Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mLandComplexDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    .line 626
    new-instance v0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mItem:Landroid/view/MenuItem;

    invoke-interface {v1}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;-><init>(Lhuawei/widget/HwBottomNavigationView;Landroid/content/Context;Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mPortComplexDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    .line 627
    invoke-static {p1}, Lhuawei/widget/HwBottomNavigationView;->access$100(Lhuawei/widget/HwBottomNavigationView;)Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwbottomnavigationview/R$dimen;->hwbottomnav_item_land_minheight:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mLandMinHeight:I

    .line 629
    invoke-static {p1}, Lhuawei/widget/HwBottomNavigationView;->access$100(Lhuawei/widget/HwBottomNavigationView;)Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwbottomnavigationview/R$dimen;->hwbottomnav_item_port_minheight:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mPortMinHeight:I

    .line 631
    invoke-static {p1}, Lhuawei/widget/HwBottomNavigationView;->access$100(Lhuawei/widget/HwBottomNavigationView;)Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwbottomnavigationview/R$integer;->hwbottomnav_item_port_textsize:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mPortTextSize:I

    .line 632
    invoke-static {p1}, Lhuawei/widget/HwBottomNavigationView;->access$100(Lhuawei/widget/HwBottomNavigationView;)Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwbottomnavigationview/R$integer;->hwbottomnav_item_land_textsize:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mLandTextSize:I

    .line 633
    invoke-static {p1}, Lhuawei/widget/HwBottomNavigationView;->access$100(Lhuawei/widget/HwBottomNavigationView;)Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwbottomnavigationview/R$integer;->hwbottomnav_text_stepgranularity:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mStepGranularity:I

    .line 634
    invoke-static {p1}, Lhuawei/widget/HwBottomNavigationView;->access$100(Lhuawei/widget/HwBottomNavigationView;)Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwbottomnavigationview/R$integer;->hwbottomnav_item_min_textsize:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mMinTextSize:I

    .line 635
    invoke-static {p1}, Lhuawei/widget/HwBottomNavigationView;->access$100(Lhuawei/widget/HwBottomNavigationView;)Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwbottomnavigationview/R$dimen;->hwbottomnav_item_vertical_padding:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mVerticalPadding:I

    .line 637
    invoke-static {p1}, Lhuawei/widget/HwBottomNavigationView;->access$100(Lhuawei/widget/HwBottomNavigationView;)Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwbottomnavigationview/R$dimen;->hwbottomnav_item_horizontal_padding:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mHorizontalPadding:I

    .line 639
    invoke-static {p1}, Lhuawei/widget/HwBottomNavigationView;->access$100(Lhuawei/widget/HwBottomNavigationView;)Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwbottomnavigationview/R$dimen;->hwbottomnav_item_top_margin:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mVerticalAddedPadding:I

    .line 641
    invoke-static {p1}, Lhuawei/widget/HwBottomNavigationView;->access$100(Lhuawei/widget/HwBottomNavigationView;)Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwbottomnavigationview/R$dimen;->hwbottomnav_item_red_dot_radius:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mRedDotRadius:I

    .line 643
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContent:Lhuawei/widget/HwTextView;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mMinTextSize:I

    iget v2, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mStepGranularity:I

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lhuawei/widget/HwTextView;->setAutoTextInfo(III)V

    .line 645
    iput-boolean p4, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mDirectionLand:Z

    .line 646
    iput p5, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mIndex:I

    .line 647
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mStartImage:Landroid/widget/ImageView;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mLandComplexDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 648
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mTopImage:Landroid/widget/ImageView;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mPortComplexDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 649
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mPaint:Landroid/graphics/Paint;

    .line 650
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mPaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 651
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setOrientation(I)V

    .line 652
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->updateTextAndIcon(ZZ)V

    .line 653
    return-void
.end method

.method private updateTextAndIcon(ZZ)V
    .locals 5

    .line 698
    if-eqz p1, :cond_1

    .line 699
    iget-boolean v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mDirectionLand:Z

    if-eqz v0, :cond_0

    .line 700
    const/16 v0, 0x11

    invoke-virtual {p0, v0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setGravity(I)V

    .line 701
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mLandMinHeight:I

    invoke-virtual {p0, v0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setMinimumHeight(I)V

    .line 702
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mHorizontalPadding:I

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mHorizontalPadding:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v2, v1, v3}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setPadding(IIII)V

    .line 703
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mTopImage:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 704
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mStartImage:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 705
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContent:Lhuawei/widget/HwTextView;

    .line 706
    invoke-virtual {v0}, Lhuawei/widget/HwTextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 707
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 708
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContent:Lhuawei/widget/HwTextView;

    invoke-virtual {v0, v4}, Lhuawei/widget/HwTextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 709
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContent:Lhuawei/widget/HwTextView;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mLandTextSize:I

    int-to-float v1, v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lhuawei/widget/HwTextView;->setAutoTextSize(IF)V

    .line 711
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContent:Lhuawei/widget/HwTextView;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Lhuawei/widget/HwTextView;->setGravity(I)V

    .line 712
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mLandComplexDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mCurrentDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    .line 713
    goto :goto_0

    .line 714
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setGravity(I)V

    .line 715
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mPortMinHeight:I

    invoke-virtual {p0, v0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setMinimumHeight(I)V

    .line 716
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mVerticalPadding:I

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mVerticalAddedPadding:I

    add-int/2addr v0, v1

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mVerticalPadding:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v0, v3, v1}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setPadding(IIII)V

    .line 717
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mTopImage:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 718
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mStartImage:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 719
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContent:Lhuawei/widget/HwTextView;

    .line 720
    invoke-virtual {v0}, Lhuawei/widget/HwTextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 721
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->this$0:Lhuawei/widget/HwBottomNavigationView;

    invoke-static {v0}, Lhuawei/widget/HwBottomNavigationView;->access$200(Lhuawei/widget/HwBottomNavigationView;)I

    move-result v0

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->this$0:Lhuawei/widget/HwBottomNavigationView;

    invoke-static {v1}, Lhuawei/widget/HwBottomNavigationView;->access$200(Lhuawei/widget/HwBottomNavigationView;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v0, v2, v1, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 722
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContent:Lhuawei/widget/HwTextView;

    invoke-virtual {v0, v4}, Lhuawei/widget/HwTextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 723
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContent:Lhuawei/widget/HwTextView;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mPortTextSize:I

    int-to-float v1, v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lhuawei/widget/HwTextView;->setAutoTextSize(IF)V

    .line 725
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContent:Lhuawei/widget/HwTextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lhuawei/widget/HwTextView;->setGravity(I)V

    .line 726
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mPortComplexDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mCurrentDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    .line 728
    :goto_0
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContent:Lhuawei/widget/HwTextView;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mItem:Landroid/view/MenuItem;

    invoke-interface {v1}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhuawei/widget/HwTextView;->setText(Ljava/lang/CharSequence;)V

    .line 729
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mCurrentDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    iget-boolean v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mChecked:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->setState(ZZ)V

    .line 731
    :cond_1
    if-eqz p2, :cond_3

    .line 732
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mLandComplexDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mActiveColor:I

    invoke-virtual {v0, v1}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->setActiveColor(I)V

    .line 733
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mLandComplexDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mDefaultColor:I

    invoke-virtual {v0, v1}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->setDefaultColor(I)V

    .line 734
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mPortComplexDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mActiveColor:I

    invoke-virtual {v0, v1}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->setActiveColor(I)V

    .line 735
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mPortComplexDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mDefaultColor:I

    invoke-virtual {v0, v1}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->setDefaultColor(I)V

    .line 736
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContent:Lhuawei/widget/HwTextView;

    iget-boolean v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mChecked:Z

    if-eqz v1, :cond_2

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mActiveColor:I

    goto :goto_1

    :cond_2
    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mDefaultColor:I

    :goto_1
    invoke-virtual {v0, v1}, Lhuawei/widget/HwTextView;->setTextColor(I)V

    .line 738
    :cond_3
    return-void
.end method


# virtual methods
.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 769
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 770
    iget-boolean v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mIsHasMessage:Z

    if-eqz v0, :cond_1

    .line 771
    invoke-virtual {p0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getIcon()Landroid/widget/ImageView;

    move-result-object v4

    .line 772
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 773
    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 774
    invoke-virtual {p0, v5}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 775
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 776
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->this$0:Lhuawei/widget/HwBottomNavigationView;

    invoke-static {v0}, Lhuawei/widget/HwBottomNavigationView;->access$300(Lhuawei/widget/HwBottomNavigationView;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, v6, Landroid/graphics/Rect;->left:I

    iget v1, v5, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v1

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mRedDotRadius:I

    add-int v7, v0, v1

    goto :goto_0

    :cond_0
    iget v0, v6, Landroid/graphics/Rect;->right:I

    iget v1, v5, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v1

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mRedDotRadius:I

    sub-int v7, v0, v1

    .line 778
    :goto_0
    iget v0, v6, Landroid/graphics/Rect;->top:I

    iget v1, v5, Landroid/graphics/Rect;->top:I

    sub-int/2addr v0, v1

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mRedDotRadius:I

    add-int v8, v0, v1

    .line 779
    int-to-float v0, v7

    int-to-float v1, v8

    iget v2, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mRedDotRadius:I

    int-to-float v2, v2

    iget-object v3, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 781
    :cond_1
    return-void
.end method

.method public getContainer()Landroid/widget/LinearLayout;
    .locals 1

    .line 749
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContainer:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public getContent()Landroid/widget/TextView;
    .locals 1

    .line 741
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContent:Lhuawei/widget/HwTextView;

    return-object v0
.end method

.method public getIcon()Landroid/widget/ImageView;
    .locals 1

    .line 745
    iget-boolean v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mDirectionLand:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mStartImage:Landroid/widget/ImageView;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mTopImage:Landroid/widget/ImageView;

    :goto_0
    return-object v0
.end method

.method public getItemIndex()I
    .locals 1

    .line 668
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mIndex:I

    return v0
.end method

.method public isHasMessage()Z
    .locals 1

    .line 753
    iget-boolean v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mIsHasMessage:Z

    return v0
.end method

.method public setActiveColor(I)Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;
    .locals 2

    .line 656
    iput p1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mActiveColor:I

    .line 657
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->updateTextAndIcon(ZZ)V

    .line 658
    return-object p0
.end method

.method public setChecked(ZZ)V
    .locals 2

    .line 678
    iget-boolean v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mChecked:Z

    if-eq p1, v0, :cond_2

    .line 679
    iput-boolean p1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mChecked:Z

    .line 680
    iget-boolean v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mDirectionLand:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mLandComplexDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mPortComplexDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    :goto_0
    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mCurrentDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    .line 681
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mCurrentDrawable:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    iget-boolean v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mChecked:Z

    invoke-virtual {v0, v1, p2}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->setState(ZZ)V

    .line 682
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mContent:Lhuawei/widget/HwTextView;

    iget-boolean v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mChecked:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mActiveColor:I

    goto :goto_1

    :cond_1
    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mDefaultColor:I

    :goto_1
    invoke-virtual {v0, v1}, Lhuawei/widget/HwTextView;->setTextColor(I)V

    .line 684
    :cond_2
    return-void
.end method

.method public setDefaultColor(I)Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;
    .locals 2

    .line 662
    iput p1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mDefaultColor:I

    .line 663
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->updateTextAndIcon(ZZ)V

    .line 664
    return-object p0
.end method

.method public setDirection(Z)V
    .locals 2

    .line 690
    iget-boolean v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mDirectionLand:Z

    if-eq p1, v0, :cond_0

    .line 691
    iput-boolean p1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mDirectionLand:Z

    .line 693
    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->updateTextAndIcon(ZZ)V

    .line 694
    return-void
.end method

.method public setHasMessage(Z)V
    .locals 0

    .line 757
    iput-boolean p1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mIsHasMessage:Z

    .line 758
    invoke-virtual {p0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->invalidate()V

    .line 759
    return-void
.end method

.method public setMsgBgColor(I)V
    .locals 2

    .line 762
    iput p1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mMsgBgColor:I

    .line 763
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mMsgBgColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 764
    invoke-virtual {p0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->invalidate()V

    .line 765
    return-void
.end method
