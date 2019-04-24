.class public Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;
.super Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryRecordsListCallback;
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;
.implements Lhuawei/widget/HwSubTabWidget$SubTabListener;


# static fields
.field private static final DIAL_HEAD:Ljava/lang/String; = "tel:"

.field static final DONE_DETAILS_TAB_INDEX:I = 0x0

.field private static final ERROR_TAB_INDEX:I = -0x1

.field static final EXTRA_KEY_CARD_ISSUERID:Ljava/lang/String; = "traffic_card_issuerId"

.field static final EXTRA_KEY_CARD_SERVICE_HOTLINE:Ljava/lang/String; = "traffic_card_service_hotline"

.field static final EXTRA_KEY_ENTER_TRADE_DETAIL_TYPE:Ljava/lang/String; = "enter_type"

.field private static final HUAWEI_SERVICE_HOTLINE:Ljava/lang/String; = "400 830 8300"

.field static final UNDONE_DETAILS_TAB_INDEX:I = 0x1

.field static sTradeInfoComparator:Ljava/util/Comparator; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private doneSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

.field private loadingTradeLayout:Landroid/widget/LinearLayout;

.field private loadingUndoneLayout:Landroid/widget/LinearLayout;

.field private mIssuerId:Ljava/lang/String;

.field private mLoadingText:Landroid/widget/TextView;

.field private mPager:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

.field private mServiceHotlineNumber:Ljava/lang/String;

.field private mSubTabWidget:Lo/emq;

.field private mTradeAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;

.field private mTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

.field private mTradeServiceHotLineTextView:Landroid/widget/TextView;

.field private mTradeServiceHotlineLayout:Landroid/widget/RelativeLayout;

.field private mUndoServiceHotLineTextView:Landroid/widget/TextView;

.field private mUndoServiceHotlineLayout:Landroid/widget/RelativeLayout;

.field private mUndoneTradeAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;

.field private mUndoneTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

.field private noTradeData:Landroid/widget/TextView;

.field private noTradeDataIv:Landroid/widget/ImageView;

.field private noUndoneTradeData:Landroid/widget/TextView;

.field private noUndoneTradeDataIv:Landroid/widget/ImageView;

.field private selectIndex:I

.field private tradeChildList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/util/List<Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;>;>;"
        }
    .end annotation
.end field

.field private tradeyyyyMMList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private unDoneSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

.field private undonechildList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/util/List<Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;>;>;"
        }
    .end annotation
.end field

.field private undoneyyyyMMAirList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 762
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity$1;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity$1;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->sTradeInfoComparator:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;-><init>()V

    .line 118
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeyyyyMMList:Ljava/util/ArrayList;

    .line 123
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeChildList:Ljava/util/ArrayList;

    .line 128
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undoneyyyyMMAirList:Ljava/util/ArrayList;

    .line 133
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undonechildList:Ljava/util/ArrayList;

    return-void
.end method

.method private callServiceHotLine()V
    .locals 5

    .line 402
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 404
    return-void

    .line 407
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tel:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 408
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.DIAL"

    invoke-direct {v3, v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 411
    :try_start_0
    invoke-virtual {p0, v3}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 416
    goto :goto_0

    .line 413
    :catch_0
    move-exception v4

    .line 415
    const-string v0, "BusCardTradeDetailActivity go to dial:"

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 417
    :goto_0
    return-void
.end method

.method public static formatPhoneNumber(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 272
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 274
    const/4 v0, 0x0

    return-object v0

    .line 278
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 281
    :pswitch_0
    const-string v0, "%s %s %s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    .line 282
    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x3

    const/4 v3, 0x6

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x6

    const/16 v3, 0xa

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 283
    goto :goto_1

    .line 285
    :pswitch_1
    const-string v0, "%s %s %s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    .line 286
    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x3

    const/4 v3, 0x7

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x7

    const/16 v3, 0xb

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 287
    goto :goto_1

    .line 289
    :pswitch_2
    const-string v0, "%s %s %s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    .line 290
    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x4

    const/16 v3, 0x8

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/16 v2, 0x8

    const/16 v3, 0xc

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 291
    goto :goto_1

    .line 293
    :goto_0
    return-object p0

    .line 295
    :goto_1
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private getCalendar([Ljava/lang/String;)Ljava/util/Calendar;
    .locals 3

    .line 530
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 531
    const/4 v0, 0x0

    aget-object v0, p1, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 532
    const/4 v0, 0x1

    aget-object v0, p1, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x2

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 533
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 534
    return-object v2
.end method

.method private getFomatorYearMonth(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 518
    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/String;

    .line 519
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const/4 v0, 0x4

    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 520
    const-string v4, ""

    .line 521
    array-length v0, v3

    const/4 v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 522
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->getCalendar([Ljava/lang/String;)Ljava/util/Calendar;

    move-result-object v5

    .line 523
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const v2, 0x10024

    invoke-static {p0, v0, v1, v2}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v4

    .line 526
    :cond_0
    return-object v4
.end method

.method private initParams()Z
    .locals 4

    .line 230
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 231
    if-nez v2, :cond_0

    .line 233
    const-string v0, "initParams, intent == null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 234
    const/4 v0, 0x0

    return v0

    .line 236
    :cond_0
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 237
    if-nez v3, :cond_1

    .line 239
    const-string v0, "initParams, bundle == null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 240
    const/4 v0, 0x0

    return v0

    .line 242
    :cond_1
    const-string v0, "enter_type"

    const/4 v1, -0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->selectIndex:I

    .line 243
    const-string v0, "traffic_card_issuerId"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mIssuerId:Ljava/lang/String;

    .line 245
    const-string v0, "traffic_card_service_hotline"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    .line 246
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 248
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->formatPhoneNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    .line 250
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 252
    const-string v0, "400 830 8300"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    .line 255
    :cond_3
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->selectIndex:I

    const/4 v1, -0x1

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mIssuerId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 257
    :cond_4
    const-string v0, "initParams, illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 258
    const/4 v0, 0x0

    return v0

    .line 260
    :cond_5
    const/4 v0, 0x1

    return v0
.end method

.method private refreshTradeData2UI()V
    .locals 3

    .line 459
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeChildList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeChildList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeyyyyMMList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeyyyyMMList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 461
    :cond_0
    const-string v0, "query detail record list success, but list is empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 462
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->showNoTradeLayout()V

    goto :goto_1

    .line 466
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 468
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeyyyyMMList:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeChildList:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;

    .line 469
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    goto :goto_0

    .line 473
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeChildList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->setData(Ljava/util/ArrayList;)V

    .line 475
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->notifyDataSetChanged()V

    .line 476
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->expandAllGroup()V

    .line 478
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->showTradeLayout()V

    .line 479
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RecordListCallback: get detailRecordList size = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeChildList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 481
    :goto_1
    return-void
.end method

.method private refreshUndoneTradeData2UI()V
    .locals 3

    .line 486
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undonechildList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undonechildList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undoneyyyyMMAirList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undoneyyyyMMAirList:Ljava/util/ArrayList;

    .line 487
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 489
    :cond_0
    const-string v0, "query detail record list success, but list is empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 490
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->showNoRechargeLayout()V

    goto :goto_1

    .line 494
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoneTradeAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 496
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undoneyyyyMMAirList:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undonechildList:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoneTradeAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;

    .line 497
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoneTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoneTradeAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    goto :goto_0

    .line 501
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoneTradeAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undonechildList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->setData(Ljava/util/ArrayList;)V

    .line 503
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoneTradeAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->notifyDataSetChanged()V

    .line 504
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoneTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->expandAllGroup()V

    .line 506
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->showRechargeLayout()V

    .line 507
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "refreshAirTradeData: get detailRecordList size = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undonechildList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 509
    :goto_1
    return-void
.end method

.method private setSelectTab(I)V
    .locals 3

    .line 421
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select index : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 422
    iput p1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->selectIndex:I

    .line 423
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 428
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeChildList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeChildList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeyyyyMMList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeyyyyMMList:Ljava/util/ArrayList;

    .line 429
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 431
    :cond_0
    const-string v0, "info is null "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 432
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->showLoadingTradeLayout()V

    .line 433
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mIssuerId:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryRecords(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryRecordsListCallback;)V

    goto :goto_1

    .line 440
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undonechildList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undonechildList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undoneyyyyMMAirList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undoneyyyyMMAirList:Ljava/util/ArrayList;

    .line 441
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 443
    :cond_1
    const-string v0, "info is null "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 444
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->showLoadingUndoneLayout()V

    .line 445
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mIssuerId:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryRecords(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryRecordsListCallback;)V

    goto :goto_1

    .line 450
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

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 453
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mPager:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->setCurrentItem(I)V

    .line 454
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method private showLoadingTradeLayout()V
    .locals 2

    .line 560
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingTradeLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 562
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingTradeLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 564
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noTradeData:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 566
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noTradeData:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 567
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noTradeDataIv:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 569
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 571
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->setVisibility(I)V

    .line 573
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeServiceHotlineLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 575
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeServiceHotlineLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 577
    :cond_3
    return-void
.end method

.method private showLoadingUndoneLayout()V
    .locals 2

    .line 539
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingUndoneLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 541
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingUndoneLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 543
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noUndoneTradeData:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 545
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noUndoneTradeData:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 546
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noUndoneTradeDataIv:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 548
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoneTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 550
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoneTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->setVisibility(I)V

    .line 552
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoServiceHotlineLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 554
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoServiceHotlineLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 556
    :cond_3
    return-void
.end method

.method private showNoRechargeLayout()V
    .locals 2

    .line 581
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingUndoneLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 583
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingUndoneLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 585
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noUndoneTradeData:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 587
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noUndoneTradeData:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 588
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noUndoneTradeDataIv:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 590
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoneTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 592
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoneTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->setVisibility(I)V

    .line 594
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoServiceHotlineLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 596
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoServiceHotlineLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 598
    :cond_3
    return-void
.end method

.method private showNoTradeLayout()V
    .locals 2

    .line 602
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingTradeLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 604
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingTradeLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 606
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noTradeData:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 608
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noTradeData:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 609
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noTradeDataIv:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 611
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 613
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->setVisibility(I)V

    .line 616
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeServiceHotlineLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 618
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeServiceHotlineLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 620
    :cond_3
    return-void
.end method

.method private showRechargeLayout()V
    .locals 2

    .line 624
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingUndoneLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 626
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingUndoneLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 628
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noUndoneTradeData:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 630
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noUndoneTradeData:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 631
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noUndoneTradeDataIv:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 633
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoneTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 635
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoneTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->setVisibility(I)V

    .line 637
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoServiceHotlineLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 639
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoServiceHotlineLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 641
    :cond_3
    return-void
.end method

.method private showTradeLayout()V
    .locals 2

    .line 645
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingTradeLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 647
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingTradeLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 649
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noTradeData:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 651
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noTradeData:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 652
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noTradeDataIv:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 654
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 656
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->setVisibility(I)V

    .line 659
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeServiceHotlineLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 661
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeServiceHotlineLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 663
    :cond_3
    return-void
.end method


# virtual methods
.method public init()V
    .locals 9

    .line 302
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->init()V

    .line 303
    sget v0, Lcom/huawei/wallet/R$string;->nfc_trade_record:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->setTitle(Ljava/lang/String;)V

    .line 304
    sget v0, Lcom/huawei/wallet/R$id;->sub_tab_views:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emq;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mSubTabWidget:Lo/emq;

    .line 305
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mSubTabWidget:Lo/emq;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_done:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->doneSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 306
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mSubTabWidget:Lo/emq;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_undone:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->unDoneSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 307
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->doneSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabWidget$SubTab;->getCallback()Lhuawei/widget/HwSubTabWidget$SubTabListener;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 308
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->doneSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {v0, p0}, Lhuawei/widget/HwSubTabWidget$SubTab;->setSubTabListener(Lhuawei/widget/HwSubTabWidget$SubTabListener;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 310
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->unDoneSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabWidget$SubTab;->getCallback()Lhuawei/widget/HwSubTabWidget$SubTabListener;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 311
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->unDoneSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {v0, p0}, Lhuawei/widget/HwSubTabWidget$SubTab;->setSubTabListener(Lhuawei/widget/HwSubTabWidget$SubTabListener;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 313
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v3

    .line 314
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_trade_detail_with_time:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 315
    sget v0, Lcom/huawei/wallet/R$id;->bus_trade_detail_record_listview:I

    .line 316
    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/pay/ui/widget/PullExpandableListView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoneTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    .line 317
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoneTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->setGroupIndicator(Landroid/graphics/drawable/Drawable;)V

    .line 318
    sget v0, Lcom/huawei/wallet/R$id;->nfc_textview_no_bus_trade_record:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noUndoneTradeData:Landroid/widget/TextView;

    .line 319
    sget v0, Lcom/huawei/wallet/R$id;->nfc_imageview_no_bus_trade_record:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noUndoneTradeDataIv:Landroid/widget/ImageView;

    .line 320
    sget v0, Lcom/huawei/wallet/R$id;->buscard_trade_info_loading_layout:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingUndoneLayout:Landroid/widget/LinearLayout;

    .line 321
    sget v0, Lcom/huawei/wallet/R$id;->progress_bar_content:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mLoadingText:Landroid/widget/TextView;

    .line 322
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mLoadingText:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_loading:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingUndoneLayout:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/wallet/R$id;->progress_bar:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ProgressBar;

    .line 327
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_2

    .line 328
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 329
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$drawable;->hw_health_loading:I

    .line 330
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 331
    invoke-virtual {v5, v6}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 334
    :cond_2
    sget v0, Lcom/huawei/wallet/R$id;->layout_buscard_trade_service_hotline:I

    .line 335
    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoServiceHotlineLayout:Landroid/widget/RelativeLayout;

    .line 336
    sget v0, Lcom/huawei/wallet/R$id;->txt_buscard_trade_service_hotline_number:I

    .line 337
    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoServiceHotLineTextView:Landroid/widget/TextView;

    .line 338
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoServiceHotLineTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 339
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mUndoServiceHotLineTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 341
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_trade_detail_with_time:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 342
    sget v0, Lcom/huawei/wallet/R$id;->bus_trade_detail_record_listview:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/pay/ui/widget/PullExpandableListView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    .line 343
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeList:Lcom/huawei/pay/ui/widget/PullExpandableListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->setGroupIndicator(Landroid/graphics/drawable/Drawable;)V

    .line 344
    sget v0, Lcom/huawei/wallet/R$id;->nfc_textview_no_bus_trade_record:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noTradeData:Landroid/widget/TextView;

    .line 345
    sget v0, Lcom/huawei/wallet/R$id;->nfc_imageview_no_bus_trade_record:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->noTradeDataIv:Landroid/widget/ImageView;

    .line 346
    sget v0, Lcom/huawei/wallet/R$id;->buscard_trade_info_loading_layout:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingTradeLayout:Landroid/widget/LinearLayout;

    .line 347
    sget v0, Lcom/huawei/wallet/R$id;->progress_bar_content:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mLoadingText:Landroid/widget/TextView;

    .line 348
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mLoadingText:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_loading:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 351
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->loadingTradeLayout:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/wallet/R$id;->progress_bar:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ProgressBar;

    .line 353
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_3

    .line 354
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 355
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$drawable;->hw_health_loading:I

    .line 356
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    .line 357
    invoke-virtual {v7, v8}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 360
    :cond_3
    sget v0, Lcom/huawei/wallet/R$id;->layout_buscard_trade_service_hotline:I

    .line 361
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeServiceHotlineLayout:Landroid/widget/RelativeLayout;

    .line 362
    sget v0, Lcom/huawei/wallet/R$id;->txt_buscard_trade_service_hotline_number:I

    .line 363
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeServiceHotLineTextView:Landroid/widget/TextView;

    .line 364
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeServiceHotLineTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 365
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mTradeServiceHotLineTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 367
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 368
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    sget v0, Lcom/huawei/wallet/R$id;->nfc_bus_card_pager:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mPager:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    .line 371
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mPager:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->setAllowScroll(Z)V

    .line 372
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mPager:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    invoke-virtual {v0, p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 373
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mPager:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/carddetail/MyPagerAdapter;

    invoke-direct {v1, v8}, Lcom/huawei/nfc/carrera/ui/carddetail/MyPagerAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 375
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undonechildList:Ljava/util/ArrayList;

    .line 376
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeChildList:Ljava/util/ArrayList;

    .line 377
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undoneyyyyMMAirList:Ljava/util/ArrayList;

    .line 378
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeyyyyMMList:Ljava/util/ArrayList;

    .line 379
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mSubTabWidget:Lo/emq;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->doneSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/emq;->addSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;Z)V

    .line 380
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mSubTabWidget:Lo/emq;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->unDoneSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/emq;->addSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;Z)V

    .line 381
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->selectIndex:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->setSelectTab(I)V

    .line 386
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 391
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 392
    sget v0, Lcom/huawei/wallet/R$id;->txt_buscard_trade_service_hotline_number:I

    if-ne v0, v1, :cond_0

    .line 393
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->callServiceHotLine()V

    .line 395
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 214
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 215
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->setRequestedOrientation(I)V

    .line 216
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_buscard_trade_detail_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->setContentView(I)V

    .line 217
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->initParams()Z

    move-result v0

    if-nez v0, :cond_0

    .line 219
    const-string v0, "BusCardTradeDetailActivity, initParams failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 220
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->finish()V

    .line 221
    return-void

    .line 223
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->init()V

    .line 226
    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 739
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    .line 745
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mSubTabWidget:Lo/emq;

    invoke-virtual {v0, p1, p2}, Lo/emq;->setSubTabScrollingOffsets(IF)V

    .line 746
    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 751
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select wyl  onPageSelected: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 752
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->setSelectTab(I)V

    .line 753
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 754
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mSubTabWidget:Lo/emq;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->doneSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {v0, v1}, Lo/emq;->selectSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;)V

    goto :goto_0

    .line 755
    :cond_0
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    .line 756
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mSubTabWidget:Lo/emq;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->unDoneSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {v0, v1}, Lo/emq;->selectSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;)V

    .line 760
    :cond_1
    :goto_0
    return-void
.end method

.method public onSubTabReselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 775
    return-void
.end method

.method public onSubTabSelected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 2

    .line 779
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select wyl  onSubTabSelected: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 780
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->doneSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    if-ne v0, p1, :cond_0

    .line 781
    const-string v0, "select wyl  DONE_DETAILS_TAB_INDEX "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 782
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->setSelectTab(I)V

    goto :goto_0

    .line 783
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->unDoneSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    if-ne v0, p1, :cond_1

    .line 784
    const-string v0, "select wyl  UNDONE_DETAILS_TAB_INDEX "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 785
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->setSelectTab(I)V

    .line 787
    :cond_1
    :goto_0
    return-void
.end method

.method public onSubTabUnselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 792
    return-void
.end method

.method public queryRecordsListCallback(IILjava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;>;)V"
        }
    .end annotation

    .line 668
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 670
    invoke-static {p0, p3}, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->changeRecordListToTradeList(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    .line 671
    const/4 v4, 0x0

    .line 672
    const/4 v5, 0x0

    .line 673
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 675
    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undoneyyyyMMAirList:Ljava/util/ArrayList;

    .line 676
    iget-object v5, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->undonechildList:Ljava/util/ArrayList;

    goto :goto_0

    .line 680
    :cond_0
    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeyyyyMMList:Ljava/util/ArrayList;

    .line 681
    iget-object v5, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->tradeChildList:Ljava/util/ArrayList;

    .line 683
    :goto_0
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 684
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 685
    const/4 v6, 0x0

    .line 686
    const/4 v7, 0x0

    .line 687
    const/4 v8, 0x0

    .line 689
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->mIssuerId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v9

    .line 690
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    const-string v0, "5943542E55534552"

    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    .line 691
    const-string v0, "5943542E55534552"

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 692
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 693
    invoke-interface {v8, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 694
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 697
    :cond_1
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->sTradeInfoComparator:Ljava/util/Comparator;

    invoke-static {v3, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 699
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;

    .line 701
    invoke-virtual {v11}, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->getmDate()Ljava/lang/String;

    move-result-object v0

    const-string v1, "[-| |:]"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 702
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-ge v0, v1, :cond_2

    .line 703
    goto :goto_1

    .line 705
    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 706
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 707
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 709
    invoke-direct {p0, v7}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->getFomatorYearMonth(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 710
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 712
    :cond_3
    move-object v6, v7

    .line 713
    if-nez v8, :cond_4

    .line 714
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 716
    :cond_4
    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 717
    goto/16 :goto_1

    .line 720
    :cond_5
    :goto_2
    if-nez p1, :cond_6

    .line 722
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->refreshTradeData2UI()V

    goto :goto_3

    .line 726
    :cond_6
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->selectIndex:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_7

    .line 728
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->handleCommonErrorCode(I)Z

    .line 730
    :cond_7
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;->refreshUndoneTradeData2UI()V

    .line 732
    :goto_3
    return-void
.end method
