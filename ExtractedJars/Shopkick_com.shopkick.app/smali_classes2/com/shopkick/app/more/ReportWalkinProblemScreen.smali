.class public Lcom/shopkick/app/more/ReportWalkinProblemScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ReportWalkinProblemScreen.java"


# static fields
.field private static final NUM_SECTIONS_STORE_AGNOSTIC:I = 0x3

.field private static final NUM_SECTIONS_STORE_SPECIFIC:I = 0x2

.field private static final SUBMIT_BUTTON_DELAY_MS:I = 0xc8


# instance fields
.field private chainId:Ljava/lang/String;

.field private completedFirstSection:Z

.field private completedSecondSection:Z

.field private completedThirdSection:Z

.field private currentSection:I

.field private locationAddress:Ljava/lang/String;

.field private locationId:Ljava/lang/String;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private mainView:Landroid/view/View;

.field private numSections:I

.field private pendingWalkinPresenceCodes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private progressBar:Landroid/widget/ProgressBar;

.field private progressText:Lcom/shopkick/app/widget/SKTextView;

.field private userLocation:Landroid/location/Location;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 62
    iput-boolean v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->completedFirstSection:Z

    .line 63
    iput-boolean v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->completedSecondSection:Z

    .line 64
    iput-boolean v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->completedThirdSection:Z

    .line 70
    iput v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->numSections:I

    .line 71
    iput v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->currentSection:I

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)Z
    .locals 0

    .line 49
    iget-boolean p0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->completedThirdSection:Z

    return p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/more/ReportWalkinProblemScreen;Z)Z
    .locals 0

    .line 49
    iput-boolean p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->completedThirdSection:Z

    return p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->updateProgress()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)I
    .locals 0

    .line 49
    iget p0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->currentSection:I

    return p0
.end method

.method static synthetic access$210(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)I
    .locals 2

    .line 49
    iget v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->currentSection:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->currentSection:I

    return v0
.end method

.method static synthetic access$300(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)Landroid/widget/ProgressBar;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->progressBar:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)I
    .locals 0

    .line 49
    iget p0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->numSections:I

    return p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)Lcom/shopkick/app/widget/SKTextView;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->progressText:Lcom/shopkick/app/widget/SKTextView;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)Landroid/view/View;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    return-object p0
.end method

.method private getEnteredStoreName()Ljava/lang/String;
    .locals 2

    .line 261
    iget-object v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->locationAddress:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 262
    iget-object v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->locationAddress:Ljava/lang/String;

    return-object v0

    .line 264
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090234

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getSelectedProblem()Ljava/lang/Integer;
    .locals 2

    .line 233
    iget-object v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090288

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v0

    const v1, 0x7f090225

    if-eq v0, v1, :cond_2

    const v1, 0x7f090258

    if-eq v0, v1, :cond_1

    const v1, 0x7f0904b4

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v0, 0x3

    .line 238
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x2

    .line 236
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x4

    .line 240
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method private getSelectedStorePosition()Ljava/lang/Integer;
    .locals 2

    .line 247
    iget-object v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v1, 0x7f09064d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v0

    const v1, 0x7f090235

    if-eq v0, v1, :cond_2

    const v1, 0x7f090315

    if-eq v0, v1, :cond_1

    const v1, 0x7f0904b3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v0, 0x2

    .line 250
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x3

    .line 252
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x4

    .line 254
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic lambda$createScreen$124(Lcom/shopkick/app/more/ReportWalkinProblemScreen;Landroid/widget/RadioGroup;I)V
    .locals 0
    .param p1    # Landroid/widget/RadioGroup;
        .annotation build Landroid/support/annotation/IdRes;
        .end annotation
    .end param

    .line 133
    invoke-direct {p0, p1}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->setSelectedButtonTextColor(Landroid/widget/RadioGroup;)V

    .line 134
    iget-boolean p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->completedFirstSection:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 135
    iput-boolean p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->completedFirstSection:Z

    .line 136
    invoke-direct {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->updateProgress()V

    .line 137
    invoke-direct {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->showSecondSection()V

    :cond_0
    return-void
.end method

.method static synthetic lambda$maybeShowThirdSection$127(Landroid/widget/ScrollView;)V
    .locals 2

    .line 184
    invoke-virtual {p0}, Landroid/widget/ScrollView;->getBottom()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    return-void
.end method

.method static synthetic lambda$maybeShowThirdSection$128(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 p2, 0x0

    const/4 v0, 0x6

    if-ne p1, v0, :cond_0

    .line 198
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setFocusable(Z)V

    :cond_0
    return p2
.end method

.method public static synthetic lambda$null$129(Lcom/shopkick/app/more/ReportWalkinProblemScreen;Landroid/view/View;)V
    .locals 0

    .line 345
    invoke-virtual {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->popScreen()V

    return-void
.end method

.method public static synthetic lambda$null$130(Lcom/shopkick/app/more/ReportWalkinProblemScreen;Landroid/view/View;)V
    .locals 2

    .line 340
    invoke-virtual {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->hideKeyboard()V

    .line 341
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v0, 0x7f090234

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 342
    invoke-direct {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->sendReport()V

    .line 344
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090702

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 345
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v0, 0x7f090112

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$eL7_5O2-dS-emG9ehCEChSNTfdU;

    invoke-direct {v0, p0}, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$eL7_5O2-dS-emG9ehCEChSNTfdU;-><init>(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic lambda$showSecondSection$125(Landroid/widget/ScrollView;)V
    .locals 2

    .line 150
    invoke-virtual {p0}, Landroid/widget/ScrollView;->getBottom()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    return-void
.end method

.method public static synthetic lambda$showSecondSection$126(Lcom/shopkick/app/more/ReportWalkinProblemScreen;Landroid/widget/RadioGroup;I)V
    .locals 0
    .param p1    # Landroid/widget/RadioGroup;
        .annotation build Landroid/support/annotation/IdRes;
        .end annotation
    .end param

    .line 153
    invoke-direct {p0, p1}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->setSelectedButtonTextColor(Landroid/widget/RadioGroup;)V

    .line 154
    iget-boolean p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->completedSecondSection:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 155
    iput-boolean p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->completedSecondSection:Z

    .line 156
    invoke-direct {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->updateProgress()V

    .line 157
    invoke-direct {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->maybeShowThirdSection()V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$updateProgress$131(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)V
    .locals 2

    .line 338
    iget-object v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090700

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    .line 339
    new-instance v1, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$pT9Fqf63aDd7I6Cb0Gpyd4shzRk;

    invoke-direct {v1, p0}, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$pT9Fqf63aDd7I6Cb0Gpyd4shzRk;-><init>(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v1, 0x0

    .line 347
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    return-void
.end method

.method private maybeShowThirdSection()V
    .locals 3

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090637

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    .line 177
    iget v1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->currentSection:I

    iget v2, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->numSections:I

    if-ne v1, v2, :cond_0

    return-void

    .line 182
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v2, 0x7f09075a

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    .line 183
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 184
    new-instance v1, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$10tCtYkGiFCSFS92eAEh9TRrJ4U;

    invoke-direct {v1, v0}, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$10tCtYkGiFCSFS92eAEh9TRrJ4U;-><init>(Landroid/widget/ScrollView;)V

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->post(Ljava/lang/Runnable;)Z

    .line 186
    iget-object v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090234

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    .line 187
    new-instance v1, Lcom/shopkick/app/more/ReportWalkinProblemScreen$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen$1;-><init>(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 196
    sget-object v1, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$yL78HPK-x5GvyasyYsGizxP9EMc;->INSTANCE:Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$yL78HPK-x5GvyasyYsGizxP9EMc;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 203
    new-instance v1, Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;-><init>(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private sendReport()V
    .locals 5

    .line 269
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x1398

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 270
    iget-object v1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 271
    iget-object v1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 272
    iget-object v1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->userLocation:Landroid/location/Location;

    if-eqz v1, :cond_0

    .line 273
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLat(Ljava/lang/Double;)V

    .line 274
    iget-object v1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->userLocation:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLng(Ljava/lang/Double;)V

    .line 275
    iget-object v1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->userLocation:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAccuracy(Ljava/lang/Double;)V

    .line 276
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    iget-object v3, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->userLocation:Landroid/location/Location;

    invoke-virtual {v3}, Landroid/location/Location;->getTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCoordAge(Ljava/lang/Integer;)V

    .line 278
    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v1

    .line 279
    invoke-virtual {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "android.permission.BLUETOOTH"

    invoke-static {v2, v3}, Landroid/support/v4/content/PermissionChecker;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-ne v2, v3, :cond_1

    const/4 v1, -0x2

    .line 282
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBtleAntennaState(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    .line 285
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBtleAntennaState(Ljava/lang/Integer;)V

    goto :goto_0

    .line 286
    :cond_2
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 288
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBtleAntennaState(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    .line 291
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBtleAntennaState(Ljava/lang/Integer;)V

    .line 294
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "location"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/LocationManager;

    .line 296
    invoke-virtual {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v2, v3}, Landroid/support/v4/content/PermissionChecker;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setGpsPermissionStatus(Ljava/lang/Integer;)V

    const-string v2, "gps"

    .line 298
    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setGpsOn(Ljava/lang/Boolean;)V

    const-string v2, "passive"

    .line 299
    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPassiveLocationProviderOn(Ljava/lang/Boolean;)V

    .line 300
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNetworkStatus(Ljava/lang/Integer;)V

    const-string v2, "network"

    .line 301
    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x3

    .line 302
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNetworkStatus(Ljava/lang/Integer;)V

    .line 305
    :cond_4
    invoke-virtual {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "connectivity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 307
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 308
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getType()I

    move-result v1

    if-ne v1, v4, :cond_5

    const/4 v1, 0x2

    .line 309
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNetworkStatus(Ljava/lang/Integer;)V

    .line 311
    :cond_5
    invoke-virtual {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "audio"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/AudioManager;

    .line 312
    invoke-virtual {v1}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result v1

    xor-int/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMicEnabled(Ljava/lang/Boolean;)V

    .line 314
    invoke-direct {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->getSelectedProblem()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWalkinIssueProblemCode(Ljava/lang/Integer;)V

    .line 315
    invoke-direct {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->getSelectedStorePosition()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWalkinIssuePosition(Ljava/lang/Integer;)V

    .line 316
    invoke-direct {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->getEnteredStoreName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWalkinIssueAddress(Ljava/lang/String;)V

    .line 318
    iget-object v1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->pendingWalkinPresenceCodes:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWalkinIssuePendingAwards(Ljava/util/ArrayList;)V

    .line 320
    invoke-virtual {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "android.permission.RECORD_AUDIO"

    invoke-static {v1, v2}, Landroid/support/v4/content/PermissionChecker;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMicPermissionStatus(Ljava/lang/Integer;)V

    .line 322
    iget-object v1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    if-eqz v1, :cond_6

    .line 323
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_6
    return-void
.end method

.method private setSelectedButtonTextColor(Landroid/widget/RadioGroup;)V
    .locals 3

    const/4 v0, 0x0

    .line 163
    :goto_0
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 164
    invoke-virtual {p1, v0}, Landroid/widget/RadioGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioButton;

    .line 165
    invoke-virtual {v1}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x7f060120

    .line 166
    invoke-virtual {p0, v2}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->getResourceColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/RadioButton;->setTextColor(I)V

    goto :goto_1

    :cond_0
    const v2, 0x7f0600c8

    .line 168
    invoke-virtual {p0, v2}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->getResourceColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/RadioButton;->setTextColor(I)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private showSecondSection()V
    .locals 3

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090637

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    .line 148
    iget-object v1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v2, 0x7f090650

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    .line 149
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 150
    new-instance v2, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$L7po9HOytHZURlanozth3UeN6NE;

    invoke-direct {v2, v0}, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$L7po9HOytHZURlanozth3UeN6NE;-><init>(Landroid/widget/ScrollView;)V

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->post(Ljava/lang/Runnable;)Z

    const v0, 0x7f09064d

    .line 152
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    new-instance v1, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$gHZUiTn2EDJJCu-DzX4zkaZoAlE;

    invoke-direct {v1, p0}, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$gHZUiTn2EDJJCu-DzX4zkaZoAlE;-><init>(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    return-void
.end method

.method private updateProgress()V
    .locals 4

    .line 331
    iget v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->currentSection:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->currentSection:I

    .line 332
    iget-object v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->progressBar:Landroid/widget/ProgressBar;

    iget v1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->currentSection:I

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 333
    iget-object v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->progressText:Lcom/shopkick/app/widget/SKTextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->currentSection:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->numSections:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 336
    iget v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->currentSection:I

    iget v1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->numSections:I

    if-ne v0, v1, :cond_0

    .line 337
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$0xMx6nSGreR00rAdSfXPOEIBY-M;

    invoke-direct {v1, p0}, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$0xMx6nSGreR00rAdSfXPOEIBY-M;-><init>(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    const p2, 0x7f1105bf

    .line 102
    invoke-virtual {p0, p2}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->setAppScreenTitle(I)V

    const p2, 0x7f0c0181

    const/4 p3, 0x0

    .line 104
    invoke-virtual {p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    .line 106
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const p2, 0x7f09054a

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->progressBar:Landroid/widget/ProgressBar;

    .line 107
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->progressBar:Landroid/widget/ProgressBar;

    iget p2, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->numSections:I

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 108
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const p2, 0x7f09054f

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iput-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->progressText:Lcom/shopkick/app/widget/SKTextView;

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->progressText:Lcom/shopkick/app/widget/SKTextView;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget p3, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->currentSection:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "/"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->numSections:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 111
    invoke-virtual {p0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    const-string p2, "fonts/AvenirLTStd-Medium.otf"

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p1

    .line 112
    iget-object p2, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const p3, 0x7f090258

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/RadioButton;

    .line 113
    iget-object p3, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v0, 0x7f0904b4

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/RadioButton;

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090225

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    .line 115
    iget-object v1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v2, 0x7f0904b3

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioButton;

    .line 116
    iget-object v2, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v3, 0x7f090315

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RadioButton;

    .line 117
    iget-object v3, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const v4, 0x7f090235

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RadioButton;

    .line 119
    invoke-virtual {p2, p1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    .line 120
    invoke-virtual {p3, p1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    .line 121
    invoke-virtual {v0, p1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    .line 122
    invoke-virtual {v1, p1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    .line 123
    invoke-virtual {v2, p1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    .line 124
    invoke-virtual {v3, p1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    .line 126
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->locationAddress:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const p1, 0x7f1105b3

    .line 127
    invoke-virtual {p0, p1}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const p1, 0x7f1105ae

    .line 129
    invoke-virtual {p0, p1}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 132
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    const p2, 0x7f090288

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RadioGroup;

    new-instance p2, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$wv4c0neKEsUHMHBB_Ldzlf2OqEo;

    invoke-direct {p2, p0}, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$wv4c0neKEsUHMHBB_Ldzlf2OqEo;-><init>(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)V

    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 141
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 75
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 77
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->userLocation:Landroid/location/Location;

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->pendingWalkinPresenceCodes:Ljava/util/ArrayList;

    .line 80
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    .line 81
    invoke-virtual {p1}, Lcom/shopkick/app/awards/AwardsManager;->getVisibleLocationRequests()Ljava/util/ArrayList;

    move-result-object p1

    .line 82
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/queue/LocationApiRequestWrapper;

    .line 83
    iget-object v1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->pendingWalkinPresenceCodes:Ljava/util/ArrayList;

    iget-object v0, v0, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->presenceCode:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string p1, "chain_id"

    .line 86
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string p1, "chain_id"

    .line 87
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->chainId:Ljava/lang/String;

    :cond_1
    const-string p1, "location_id"

    .line 89
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string p1, "location_id"

    .line 90
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->locationId:Ljava/lang/String;

    :cond_2
    const-string p1, "location_address"

    .line 92
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string p1, "location_address"

    .line 93
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->locationAddress:Ljava/lang/String;

    const/4 p1, 0x2

    .line 94
    iput p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->numSections:I

    goto :goto_1

    :cond_3
    const/4 p1, 0x3

    .line 96
    iput p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->numSections:I

    :goto_1
    return-void
.end method
