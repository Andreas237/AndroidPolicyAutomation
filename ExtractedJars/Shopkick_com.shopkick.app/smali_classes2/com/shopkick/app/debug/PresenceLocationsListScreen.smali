.class public Lcom/shopkick/app/debug/PresenceLocationsListScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "PresenceLocationsListScreen.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private listAdapter:Lcom/shopkick/app/debug/PresenceLocationsListAdapter;

.field private locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

.field private presenceController:Lcom/shopkick/app/presence/PresenceController;

.field private transmittersDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    const p3, 0x7f0c0158

    const/4 v0, 0x0

    .line 51
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090420

    .line 53
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ListView;

    .line 54
    new-instance p3, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;

    invoke-virtual {p0}, Lcom/shopkick/app/debug/PresenceLocationsListScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/debug/PresenceLocationsListScreen;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v3, p0, Lcom/shopkick/app/debug/PresenceLocationsListScreen;->transmittersDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

    iget-object v4, p0, Lcom/shopkick/app/debug/PresenceLocationsListScreen;->chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

    iget-object v5, p0, Lcom/shopkick/app/debug/PresenceLocationsListScreen;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    iget-object v6, p0, Lcom/shopkick/app/debug/PresenceLocationsListScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v0, p3

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;-><init>(Landroid/content/Context;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;Lcom/shopkick/app/chains/ChainDataSource;Lcom/shopkick/app/presence/PresenceController;Lcom/shopkick/app/application/ClientFlagsManager;Landroid/widget/ListView;)V

    iput-object p3, p0, Lcom/shopkick/app/debug/PresenceLocationsListScreen;->listAdapter:Lcom/shopkick/app/debug/PresenceLocationsListAdapter;

    .line 61
    iget-object p3, p0, Lcom/shopkick/app/debug/PresenceLocationsListScreen;->listAdapter:Lcom/shopkick/app/debug/PresenceLocationsListAdapter;

    invoke-virtual {p2, p3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-object p1
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

    .line 42
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iput-object p2, p0, Lcom/shopkick/app/debug/PresenceLocationsListScreen;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 43
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->transmittersDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

    iput-object p2, p0, Lcom/shopkick/app/debug/PresenceLocationsListScreen;->transmittersDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

    .line 44
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

    iput-object p2, p0, Lcom/shopkick/app/debug/PresenceLocationsListScreen;->chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

    .line 45
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    iput-object p2, p0, Lcom/shopkick/app/debug/PresenceLocationsListScreen;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    .line 46
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p1, p0, Lcom/shopkick/app/debug/PresenceLocationsListScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/debug/PresenceLocationsListScreen;->listAdapter:Lcom/shopkick/app/debug/PresenceLocationsListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->destroyAdapter()V

    .line 69
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method
