.class public Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;
.super Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final CARD_NAME:Ljava/lang/String; = "cardName"

.field private static final FIRST_INSERT_INDEX:I = 0x3

.field public static final HOT_ACTIVITY:Ljava/lang/String; = "hotActivity"

.field private static final HOT_EVENTS_TAB_INDEX:I = 0x0

.field private static final INSERT_CHARACTER:C = ' '

.field private static final NORMAL_PHONE_LENGTH:I = 0xa

.field private static final RECOMMENDED_MERCHANTS_TAB_INDEX:I = 0x1

.field public static final RECOMMEND_MERCHANT:Ljava/lang/String; = "recommendMerchant"

.field private static final SECOND_INSERT_INDEX:I = 0x6

.field public static final SERVICE_PHONE:Ljava/lang/String; = "servicePhone"

.field private static final TAG:Ljava/lang/String; = "BankDetailFragment"


# instance fields
.field private hotActivityClient:Landroid/webkit/WebViewClient;

.field private hotLoading:Landroid/widget/LinearLayout;

.field private listviews:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private mErrorCode:I

.field private mHotActLayout:Landroid/widget/RelativeLayout;

.field private mPager:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

.field private mRecShopLayout:Landroid/widget/RelativeLayout;

.field private networkExceptionLayout:Landroid/widget/RelativeLayout;

.field private networkFailLayout:Landroid/widget/LinearLayout;

.field private noHotActivityData:Landroid/widget/TextView;

.field private noNetworkFlash:Landroid/widget/LinearLayout;

.field private noRecommendData:Landroid/widget/TextView;

.field private phone:Landroid/widget/TextView;

.field private recommendClient:Landroid/webkit/WebViewClient;

.field private recommendLoading:Landroid/widget/LinearLayout;

.field private servicePhone:Ljava/lang/String;

.field private setNetworkButton:Lo/egd;

.field private title:Ljava/lang/String;

.field private urlHot:Ljava/lang/String;

.field private urlRecommend:Ljava/lang/String;

.field private webViewHot:Landroid/webkit/WebView;

.field private webViewRecommend:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;-><init>()V

    .line 140
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mErrorCode:I

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;)I
    .locals 1

    .line 35
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mErrorCode:I

    return v0
.end method

.method static synthetic access$002(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;I)I
    .locals 0

    .line 35
    iput p1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mErrorCode:I

    return p1
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;II)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->controlHotLoading(II)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;)Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mPager:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->networkFailLayout:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->networkExceptionLayout:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;II)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->controlRecommendLoading(II)V

    return-void
.end method

.method private controlHotLoading(II)V
    .locals 2

    .line 517
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->hotLoading:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 519
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->hotLoading:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 521
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->webViewHot:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 523
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->webViewHot:Landroid/webkit/WebView;

    invoke-virtual {v0, p2}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 525
    :cond_1
    return-void
.end method

.method private controlRecommendLoading(II)V
    .locals 2

    .line 535
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->recommendLoading:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 537
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->recommendLoading:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 539
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->webViewRecommend:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 541
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->webViewRecommend:Landroid/webkit/WebView;

    invoke-virtual {v0, p2}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 543
    :cond_1
    return-void
.end method

.method private formatPhoneNumber(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 552
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 554
    const/4 v0, 0x0

    return-object v0

    .line 556
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    if-eq v1, v0, :cond_1

    .line 558
    return-object p1

    .line 560
    :cond_1
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 561
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v3, v0, :cond_4

    .line 563
    const/4 v0, 0x3

    if-eq v0, v3, :cond_2

    const/4 v0, 0x6

    if-ne v0, v3, :cond_3

    .line 565
    :cond_2
    const/16 v0, 0x20

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 567
    :cond_3
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 561
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 569
    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private initParams()Z
    .locals 3

    .line 246
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 247
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 249
    const-string v0, "initParams intent empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 250
    const/4 v0, 0x0

    return v0

    .line 253
    :cond_0
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 254
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 256
    const-string v0, "bundle empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 257
    const/4 v0, 0x0

    return v0

    .line 260
    :cond_1
    const-string v0, "hotActivity"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->urlHot:Ljava/lang/String;

    .line 261
    const-string v0, "recommendMerchant"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->urlRecommend:Ljava/lang/String;

    .line 262
    const-string v0, "cardName"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->title:Ljava/lang/String;

    .line 263
    const-string v0, "servicePhone"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->servicePhone:Ljava/lang/String;

    .line 265
    const/4 v0, 0x1

    return v0
.end method

.method private initViews()V
    .locals 6

    .line 274
    sget v0, Lcom/huawei/wallet/R$id;->network_fail_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->networkFailLayout:Landroid/widget/LinearLayout;

    .line 275
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->networkFailLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 276
    sget v0, Lcom/huawei/wallet/R$id;->query_fail_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->networkExceptionLayout:Landroid/widget/RelativeLayout;

    .line 277
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->networkExceptionLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 278
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->networkExceptionLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 279
    sget v0, Lcom/huawei/wallet/R$id;->set_network_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->setNetworkButton:Lo/egd;

    .line 280
    sget v0, Lcom/huawei/wallet/R$id;->no_network_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->noNetworkFlash:Landroid/widget/LinearLayout;

    .line 281
    sget v0, Lcom/huawei/wallet/R$id;->number:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->phone:Landroid/widget/TextView;

    .line 282
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->phone:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->servicePhone:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->formatPhoneNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 284
    sget v0, Lcom/huawei/wallet/R$id;->vpager:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mPager:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    .line 285
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->listviews:Ljava/util/List;

    .line 286
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v3

    .line 289
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_detail_hot_activity:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 290
    sget v0, Lcom/huawei/wallet/R$id;->webview_hot_activity:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->webViewHot:Landroid/webkit/WebView;

    .line 291
    sget v0, Lcom/huawei/wallet/R$id;->hot_loading:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->hotLoading:Landroid/widget/LinearLayout;

    .line 292
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->webViewHot:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->hotActivityClient:Landroid/webkit/WebViewClient;

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->initWebViewSettings(Landroid/webkit/WebView;Landroid/webkit/WebViewClient;)V

    .line 293
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->listviews:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 294
    sget v0, Lcom/huawei/wallet/R$id;->nfc_textview_hot:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->noHotActivityData:Landroid/widget/TextView;

    .line 297
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_detail_recommended_merchant:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 298
    sget v0, Lcom/huawei/wallet/R$id;->webview_recommend:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->webViewRecommend:Landroid/webkit/WebView;

    .line 299
    sget v0, Lcom/huawei/wallet/R$id;->recommend_loading:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->recommendLoading:Landroid/widget/LinearLayout;

    .line 300
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->webViewRecommend:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->recommendClient:Landroid/webkit/WebViewClient;

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->initWebViewSettings(Landroid/webkit/WebView;Landroid/webkit/WebViewClient;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->listviews:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 302
    sget v0, Lcom/huawei/wallet/R$id;->nfc_textview_recommend:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->noRecommendData:Landroid/widget/TextView;

    .line 304
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mPager:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/carddetail/MyPagerAdapter;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->listviews:Ljava/util/List;

    invoke-direct {v1, v2}, Lcom/huawei/nfc/carrera/ui/carddetail/MyPagerAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mPager:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->setCurrentItem(I)V

    .line 307
    sget v0, Lcom/huawei/wallet/R$id;->layout_left:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mHotActLayout:Landroid/widget/RelativeLayout;

    .line 308
    sget v0, Lcom/huawei/wallet/R$id;->right:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mRecShopLayout:Landroid/widget/RelativeLayout;

    .line 309
    return-void
.end method

.method private initWebViewClient()V
    .locals 1

    .line 399
    new-instance v0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->hotActivityClient:Landroid/webkit/WebViewClient;

    .line 442
    new-instance v0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->recommendClient:Landroid/webkit/WebViewClient;

    .line 485
    return-void
.end method

.method private initWebViewSettings(Landroid/webkit/WebView;Landroid/webkit/WebViewClient;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .line 505
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 506
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 507
    return-void
.end method

.method private setSelectTab(I)V
    .locals 2

    .line 319
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 322
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mHotActLayout:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/wallet/R$drawable;->nfc_detail_sub_tab_selected_left_white:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 324
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->urlHot:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->urlHot:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 326
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->webViewHot:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->urlHot:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 327
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->noHotActivityData:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 328
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->networkFailLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 329
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->networkExceptionLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_1

    .line 333
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->noHotActivityData:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 335
    goto :goto_1

    .line 338
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mRecShopLayout:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/wallet/R$drawable;->nfc_detail_sub_tab_selected_right_white:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 339
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->urlRecommend:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->urlRecommend:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 341
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->webViewRecommend:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->urlRecommend:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 342
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->noRecommendData:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 343
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->networkFailLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 344
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->networkExceptionLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_1

    .line 348
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->noRecommendData:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 350
    goto :goto_1

    .line 352
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "error index : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " !"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 355
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 372
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 373
    sget v0, Lcom/huawei/wallet/R$id;->layout_left:I

    if-ne v0, v2, :cond_0

    .line 375
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->setSelectTab(I)V

    .line 376
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mPager:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->setCurrentItem(I)V

    goto :goto_0

    .line 378
    :cond_0
    sget v0, Lcom/huawei/wallet/R$id;->no_network_tip:I

    if-eq v0, v2, :cond_1

    sget v0, Lcom/huawei/wallet/R$id;->query_fail_view:I

    if-ne v0, v2, :cond_2

    .line 380
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mPager:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->getCurrentItem()I

    move-result v3

    .line 381
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->setSelectTab(I)V

    .line 382
    goto :goto_0

    .line 383
    :cond_2
    sget v0, Lcom/huawei/wallet/R$id;->set_network_button:I

    if-ne v0, v2, :cond_3

    .line 385
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/wallet/utils/BaseLibUtil;->c(Landroid/content/Context;)V

    goto :goto_0

    .line 387
    :cond_3
    sget v0, Lcom/huawei/wallet/R$id;->right:I

    if-ne v0, v2, :cond_4

    .line 389
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->setSelectTab(I)V

    .line 390
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mPager:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->setCurrentItem(I)V

    .line 392
    :cond_4
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitTransaction",
            "NewApi"
        }
    .end annotation

    .line 195
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 196
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->setRequestedOrientation(I)V

    .line 197
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->initParams()Z

    move-result v0

    if-nez v0, :cond_0

    .line 199
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->finish()V

    .line 200
    return-void

    .line 203
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->title:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->setTitle(Ljava/lang/String;)V

    .line 204
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_detail_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->setContentView(I)V

    .line 206
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->initWebViewClient()V

    .line 207
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->initViews()V

    .line 209
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mHotActLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mRecShopLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->noNetworkFlash:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->setNetworkButton:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 214
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->setSelectTab(I)V

    .line 216
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->urlHot:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 218
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->webViewHot:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->urlHot:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 220
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->webViewHot:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 221
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->noHotActivityData:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 225
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->noHotActivityData:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 228
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->urlRecommend:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 230
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->webViewRecommend:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->urlRecommend:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 231
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->noRecommendData:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 235
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->noRecommendData:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 237
    :goto_1
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 360
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->mPager:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->getCurrentItem()I

    move-result v1

    .line 361
    invoke-direct {p0, v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->setSelectTab(I)V

    .line 362
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onResume()V

    .line 364
    return-void
.end method
