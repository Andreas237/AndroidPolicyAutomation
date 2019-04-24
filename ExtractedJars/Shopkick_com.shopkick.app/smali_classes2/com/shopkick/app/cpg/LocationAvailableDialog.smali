.class public Lcom/shopkick/app/cpg/LocationAvailableDialog;
.super Landroid/app/Dialog;
.source "LocationAvailableDialog.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final POPUP_MARGIN:I

.field private final POPUP_MAX_WIDTH:I

.field private availabilityText:Ljava/lang/String;

.field private bundleId:Ljava/lang/String;

.field private configurator:Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;

.field private contentView:Landroid/view/View;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private isForReceiptScan:Z

.field private listAdapter:Lcom/shopkick/app/cpg/LocationAvailableAdapter;

.field private listView:Landroid/widget/ListView;

.field private loadingSpinner:Landroid/view/View;

.field private locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

.field private locationIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private productFamilyId:Ljava/lang/String;

.field private tilePosition:I

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/util/NotificationCenter;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;",
            "Lcom/shopkick/app/logging/UserEventLogger;",
            "Lcom/shopkick/app/location/LocationNotifier;",
            "Lcom/shopkick/app/account/UserAccount;",
            "Lcom/shopkick/app/cpg/LocationDataSource;",
            "Lcom/shopkick/app/util/NotificationCenter;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IZ)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p6

    move-object v3, p7

    move-object/from16 v4, p8

    const v5, 0x7f120217

    .line 83
    invoke-direct {p0, p1, v5}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/16 v5, 0x16d

    .line 38
    iput v5, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->POPUP_MAX_WIDTH:I

    const/16 v6, 0x16

    .line 39
    iput v6, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->POPUP_MARGIN:I

    const/4 v7, 0x1

    .line 85
    invoke-virtual {p0, v7}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->setCanceledOnTouchOutside(Z)V

    move-object v7, p4

    .line 87
    iput-object v7, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 88
    iput-object v2, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    .line 89
    iput-object v3, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    move-object v7, p5

    .line 90
    iput-object v7, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->userAccount:Lcom/shopkick/app/account/UserAccount;

    move-object v7, p3

    .line 91
    iput-object v7, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object v7, p2

    .line 92
    iput-object v7, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->configurator:Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;

    .line 94
    iput-object v4, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->locationIds:Ljava/util/List;

    move-object/from16 v7, p9

    .line 95
    iput-object v7, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->productFamilyId:Ljava/lang/String;

    move-object/from16 v7, p11

    .line 96
    iput-object v7, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->availabilityText:Ljava/lang/String;

    move/from16 v7, p12

    .line 97
    iput v7, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->tilePosition:I

    move/from16 v7, p13

    .line 98
    iput-boolean v7, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->isForReceiptScan:Z

    move-object/from16 v7, p10

    .line 99
    iput-object v7, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->bundleId:Ljava/lang/String;

    .line 102
    invoke-static {p1}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result v7

    .line 103
    invoke-static {v6, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v6

    mul-int/lit8 v6, v6, 0x2

    sub-int/2addr v7, v6

    .line 105
    invoke-static {v5, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v1

    if-le v7, v1, :cond_0

    .line 109
    invoke-virtual {p0}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->getWindow()Landroid/view/Window;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    .line 110
    iput v1, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 114
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v5, 0x7f0c010f

    const/4 v6, 0x0

    .line 115
    invoke-virtual {v1, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->contentView:Landroid/view/View;

    .line 116
    iget-object v1, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->contentView:Landroid/view/View;

    const v5, 0x7f090439

    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ListView;

    iput-object v1, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->listView:Landroid/widget/ListView;

    .line 117
    iget-object v1, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->contentView:Landroid/view/View;

    const v5, 0x7f09043a

    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->loadingSpinner:Landroid/view/View;

    .line 120
    iget-object v1, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->contentView:Landroid/view/View;

    invoke-direct {p0, v1}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->setupLayout(Landroid/view/View;)V

    .line 123
    invoke-virtual {p6, v4}, Lcom/shopkick/app/cpg/LocationDataSource;->getLocationsList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_1

    .line 127
    iget-object v1, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->listView:Landroid/widget/ListView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setVisibility(I)V

    .line 128
    iget-object v1, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->loadingSpinner:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    const-string v1, "EventLocationsUpdated"

    .line 129
    invoke-virtual {p7, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto :goto_0

    .line 131
    :cond_1
    invoke-direct {p0, v1}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->setupListView(Ljava/util/List;)V

    .line 135
    :goto_0
    iget-object v1, v0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->contentView:Landroid/view/View;

    const v2, 0x7f090438

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/shopkick/app/cpg/LocationAvailableDialog$1;

    invoke-direct {v2, p0}, Lcom/shopkick/app/cpg/LocationAvailableDialog$1;-><init>(Lcom/shopkick/app/cpg/LocationAvailableDialog;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private sendLog(I)V
    .locals 2

    .line 240
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    iget-boolean v1, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->isForReceiptScan:Z

    if-eqz v1, :cond_0

    const/16 v1, 0xc5

    goto :goto_0

    :cond_0
    const/16 v1, 0xc7

    .line 241
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 242
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 243
    iget-object p1, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 244
    iget-object p1, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private setupLayout(Landroid/view/View;)V
    .locals 6

    .line 163
    iget-boolean v0, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->isForReceiptScan:Z

    const v1, 0x7f090438

    const/4 v2, 0x0

    const v3, 0x7f09043b

    const/16 v4, 0x8

    const v5, 0x7f09043c

    if-eqz v0, :cond_0

    .line 164
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 165
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 166
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    const v0, 0x7f11015b

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    goto :goto_0

    .line 168
    :cond_0
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 169
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 170
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    const v0, 0x7f11015f

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    :goto_0
    return-void
.end method

.method private setupListView(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 144
    new-instance v9, Lcom/shopkick/app/cpg/LocationAvailableAdapter;

    invoke-virtual {p0}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v3, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v4, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v6, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->productFamilyId:Ljava/lang/String;

    iget-object v7, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->availabilityText:Ljava/lang/String;

    iget-boolean v8, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->isForReceiptScan:Z

    move-object v0, v9

    move-object v5, p1

    invoke-direct/range {v0 .. v8}, Lcom/shopkick/app/cpg/LocationAvailableAdapter;-><init>(Landroid/content/Context;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/logging/UserEventLogger;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v9, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->listAdapter:Lcom/shopkick/app/cpg/LocationAvailableAdapter;

    .line 152
    iget-object p1, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->listView:Landroid/widget/ListView;

    iget-object v0, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->listAdapter:Lcom/shopkick/app/cpg/LocationAvailableAdapter;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 154
    iget-object p1, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->listAdapter:Lcom/shopkick/app/cpg/LocationAvailableAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->notifyDataSetChanged()V

    .line 155
    iget-object p1, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->listView:Landroid/widget/ListView;

    invoke-virtual {p1, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 158
    iget-object p1, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->listView:Landroid/widget/ListView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setVisibility(I)V

    .line 159
    iget-object p1, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->loadingSpinner:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    .line 190
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->listAdapter:Lcom/shopkick/app/cpg/LocationAvailableAdapter;

    if-eqz v0, :cond_0

    .line 192
    invoke-virtual {v0}, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->destroy()V

    .line 194
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    const/16 v0, 0x30

    .line 197
    invoke-direct {p0, v0}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->sendLog(I)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 176
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 177
    iget-object p1, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->contentView:Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 206
    iget-object p2, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v0, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->locationIds:Ljava/util/List;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/cpg/LocationDataSource;->getLocationsList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    const-string v0, "EventLocationsUpdated"

    .line 208
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 210
    invoke-direct {p0, p2}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->setupListView(Ljava/util/List;)V

    .line 211
    iget-object p1, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    :cond_0
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 224
    invoke-virtual {p2}, Landroid/view/View;->performClick()Z

    .line 227
    invoke-virtual {p0}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->dismiss()V

    .line 228
    iget-object v0, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->configurator:Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;

    iget-boolean v1, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->isForReceiptScan:Z

    iget-object p1, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->listAdapter:Lcom/shopkick/app/cpg/LocationAvailableAdapter;

    .line 229
    invoke-virtual {p1, p3}, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    iget-object v3, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->productFamilyId:Ljava/lang/String;

    iget-object v4, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->bundleId:Ljava/lang/String;

    iget v5, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog;->tilePosition:I

    .line 228
    invoke-interface/range {v0 .. v5}, Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;->goToScreenFromDialog(ZLcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public show()V
    .locals 1

    .line 182
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    const/4 v0, 0x3

    .line 185
    invoke-direct {p0, v0}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->sendLog(I)V

    return-void
.end method
