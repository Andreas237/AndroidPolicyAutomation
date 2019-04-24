.class Lcom/ibotta/android/view/map/RetailerLocationsMapView$CantFindItInfoWindow;
.super Ljava/lang/Object;
.source "RetailerLocationsMapView.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/view/map/RetailerLocationsMapView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CantFindItInfoWindow"
.end annotation


# instance fields
.field private inflater:Landroid/view/LayoutInflater;

.field final synthetic this$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/view/map/RetailerLocationsMapView;)V
    .locals 0

    .line 428
    iput-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView$CantFindItInfoWindow;->this$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;)V
    .locals 0

    .line 428
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView$CantFindItInfoWindow;-><init>(Lcom/ibotta/android/view/map/RetailerLocationsMapView;)V

    return-void
.end method


# virtual methods
.method public getInfoContents(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;
    .locals 3

    .line 433
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView$CantFindItInfoWindow;->inflater:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    .line 434
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView$CantFindItInfoWindow;->this$0:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView$CantFindItInfoWindow;->inflater:Landroid/view/LayoutInflater;

    .line 436
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView$CantFindItInfoWindow;->inflater:Landroid/view/LayoutInflater;

    const v1, 0x7f0c0176

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09057a

    .line 437
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f090579

    .line 438
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getSnippet()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p1, 0x7f090572

    .line 439
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-object v0
.end method

.method public getInfoWindow(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
