.class public Lcom/shopkick/app/debug/GPSCheckinDebugScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "GPSCheckinDebugScreen.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinAdapter;,
        Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private storeNearbyNotifier:Lcom/shopkick/app/location/StoreNearbyNotifier;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method public static synthetic lambda$createScreen$69(Lcom/shopkick/app/debug/GPSCheckinDebugScreen;Ljava/util/ArrayList;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 52
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;

    .line 53
    iget-object p2, p0, Lcom/shopkick/app/debug/GPSCheckinDebugScreen;->storeNearbyNotifier:Lcom/shopkick/app/location/StoreNearbyNotifier;

    iget-object p3, p1, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;->checkinLocation:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    iget-object p1, p1, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;->location:Landroid/location/Location;

    invoke-virtual {p2, p3, p1}, Lcom/shopkick/app/location/StoreNearbyNotifier;->triggerWalkin(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;Landroid/location/Location;)V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 18

    move-object/from16 v0, p0

    .line 40
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/debug/GPSCheckinDebugScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/activities/BaseActivity;->getApplication()Landroid/app/Application;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/application/SKApp;

    iget-object v1, v1, Lcom/shopkick/app/application/SKApp;->storeNearbyNotifier:Lcom/shopkick/app/location/StoreNearbyNotifier;

    iput-object v1, v0, Lcom/shopkick/app/debug/GPSCheckinDebugScreen;->storeNearbyNotifier:Lcom/shopkick/app/location/StoreNearbyNotifier;

    const v1, 0x7f0c0158

    const/4 v2, 0x0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    .line 42
    invoke-virtual {v3, v1, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 44
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 45
    new-instance v10, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;

    const-string v4, "Walmart (Mountain View)"

    const-string v5, "12859460490"

    const-wide v6, 0x4042b3538ac18f82L    # 37.400987

    const-wide v8, -0x3fa178fa7be41e6fL    # -122.109711673

    move-object v3, v10

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;-><init>(Ljava/lang/String;Ljava/lang/String;DD)V

    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    new-instance v3, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;

    const-string v12, "CVS (redwood city)"

    const-string v13, "9011031000"

    const-wide v14, 0x4042be1a1db877abL    # 37.485172

    const-wide v16, -0x3fa17130be0ded29L    # -122.2314

    move-object v11, v3

    invoke-direct/range {v11 .. v17}, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;-><init>(Ljava/lang/String;Ljava/lang/String;DD)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    new-instance v3, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;

    const-string v5, "Safeway (redwood city)"

    const-string v6, "13841630282"

    const-wide v7, 0x4042be04a72ead92L    # 37.484517

    const-wide v9, -0x3fa1713b9ae0c176L    # -122.230737

    move-object v4, v3

    invoke-direct/range {v4 .. v10}, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;-><init>(Ljava/lang/String;Ljava/lang/String;DD)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v3, 0x7f090420

    .line 49
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ListView;

    .line 50
    new-instance v4, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinAdapter;

    invoke-direct {v4, v2}, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinAdapter;-><init>(Ljava/util/ArrayList;)V

    invoke-virtual {v3, v4}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 51
    new-instance v4, Lcom/shopkick/app/debug/-$$Lambda$GPSCheckinDebugScreen$3YO3a7n1zgY3t6LoSxdWojLmEmk;

    invoke-direct {v4, v0, v2}, Lcom/shopkick/app/debug/-$$Lambda$GPSCheckinDebugScreen$3YO3a7n1zgY3t6LoSxdWojLmEmk;-><init>(Lcom/shopkick/app/debug/GPSCheckinDebugScreen;Ljava/util/ArrayList;)V

    invoke-virtual {v3, v4}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-object v1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
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

    return-void
.end method
