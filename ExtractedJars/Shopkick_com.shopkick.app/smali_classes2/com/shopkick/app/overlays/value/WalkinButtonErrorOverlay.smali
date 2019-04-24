.class public Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "WalkinButtonErrorOverlay.java"


# instance fields
.field private mainView:Landroid/view/View;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    return-void
.end method

.method public static synthetic lambda$createView$167(Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;Landroid/view/View;)V
    .locals 0

    .line 88
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->dismiss()V

    return-void
.end method

.method public static synthetic lambda$createView$168(Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;ZZZLandroid/view/View;)V
    .locals 2

    .line 92
    new-instance p4, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x116

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p4, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    xor-int/lit8 p1, p1, 0x1

    .line 93
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p4, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBlePermissionGranted(Ljava/lang/Boolean;)V

    xor-int/lit8 p1, p2, 0x1

    .line 94
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p4, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMicPermissionGranted(Ljava/lang/Boolean;)V

    xor-int/lit8 p1, p3, 0x1

    .line 95
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p4, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setGpsPermissionGranted(Ljava/lang/Boolean;)V

    .line 96
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, p4}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 98
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->dismiss()V

    .line 99
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string p2, "chain_id"

    .line 100
    iget-object p3, p0, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "location_id"

    .line 101
    iget-object p3, p0, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "location_address"

    .line 102
    iget-object p3, p0, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->title:Ljava/lang/String;

    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    new-instance p2, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class p3, Lcom/shopkick/app/activities/DetailsActivity;

    const-class p4, Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    invoke-direct {p2, p3, p4, p1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 107
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {p2}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 10

    .line 38
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->mainView:Landroid/view/View;

    .line 40
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f09076e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    .line 41
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->departmentId:Ljava/lang/String;

    if-eqz v1, :cond_0

    const v1, 0x7f1106d0

    .line 42
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    goto :goto_0

    :cond_0
    const v1, 0x7f1106d2

    .line 44
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    :goto_0
    const-string v0, "android.permission.BLUETOOTH"

    .line 47
    invoke-static {v0, p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "android.permission.RECORD_AUDIO"

    .line 49
    invoke-static {v2, p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v2

    xor-int/2addr v2, v1

    const-string v3, "HIGH_ACCURACY_LOCATION"

    .line 51
    invoke-static {v3, p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v3

    xor-int/2addr v3, v1

    .line 54
    iget-object v4, p0, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->mainView:Landroid/view/View;

    const v5, 0x7f09051f

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/widget/SKTextView;

    if-nez v0, :cond_2

    if-nez v2, :cond_2

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const/16 p1, 0x8

    .line 85
    invoke-virtual {v4, p1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    goto/16 :goto_4

    :cond_2
    :goto_1
    const-string v5, ""

    const v6, 0x7f110774

    .line 57
    invoke-virtual {p1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x7f11077a

    .line 58
    invoke-virtual {p1, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x7f110778

    .line 59
    invoke-virtual {p1, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    const v9, 0x7f1101b1

    .line 60
    invoke-virtual {p1, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    if-eqz v0, :cond_3

    if-eqz v2, :cond_3

    if-eqz v3, :cond_3

    .line 62
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ", "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ","

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_3

    :cond_3
    if-eqz v0, :cond_4

    move-object v5, v6

    :cond_4
    if-eqz v2, :cond_6

    .line 68
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_2

    .line 71
    :cond_5
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_6
    move-object v7, v5

    :goto_2
    if-eqz v3, :cond_8

    .line 75
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_3

    .line 78
    :cond_7
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_3

    :cond_8
    move-object v8, v7

    :goto_3
    const v5, 0x7f1106d1

    .line 82
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v8, v1, v6

    invoke-virtual {p1, v5, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 83
    invoke-virtual {v4, v6}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 88
    :goto_4
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f0904d3

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v1, Lcom/shopkick/app/overlays/value/-$$Lambda$WalkinButtonErrorOverlay$D31GA4qEXPXHbE9tbmDr2wW4Sy4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/value/-$$Lambda$WalkinButtonErrorOverlay$D31GA4qEXPXHbE9tbmDr2wW4Sy4;-><init>(Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f0905f4

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v1, Lcom/shopkick/app/overlays/value/-$$Lambda$WalkinButtonErrorOverlay$uQl2MJjWL-Il4EgZHkpSzFiHW9Q;

    invoke-direct {v1, p0, v0, v2, v3}, Lcom/shopkick/app/overlays/value/-$$Lambda$WalkinButtonErrorOverlay$uQl2MJjWL-Il4EgZHkpSzFiHW9Q;-><init>(Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;ZZZ)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public destroy()V
    .locals 1

    const/4 v0, 0x0

    .line 115
    iput-object v0, p0, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->mainView:Landroid/view/View;

    .line 116
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f12022d

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c01ea

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->mainView:Landroid/view/View;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 31
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 33
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method
