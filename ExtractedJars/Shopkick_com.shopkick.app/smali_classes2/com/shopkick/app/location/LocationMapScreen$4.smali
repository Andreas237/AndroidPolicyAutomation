.class Lcom/shopkick/app/location/LocationMapScreen$4;
.super Ljava/lang/Object;
.source "LocationMapScreen.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/location/LocationMapScreen;->customizeMap()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/location/LocationMapScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/location/LocationMapScreen;)V
    .locals 0

    .line 345
    iput-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen$4;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInfoContents(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getInfoWindow(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;
    .locals 3

    .line 348
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getTitle()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen$4;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    invoke-static {v0}, Lcom/shopkick/app/location/LocationMapScreen;->access$400(Lcom/shopkick/app/location/LocationMapScreen;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen$4;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    invoke-static {p1}, Lcom/shopkick/app/location/LocationMapScreen;->access$500(Lcom/shopkick/app/location/LocationMapScreen;)Landroid/view/LayoutInflater;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 349
    iget-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen$4;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    invoke-static {p1}, Lcom/shopkick/app/location/LocationMapScreen;->access$500(Lcom/shopkick/app/location/LocationMapScreen;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c011a

    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen$4;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    .line 350
    invoke-static {v1}, Lcom/shopkick/app/location/LocationMapScreen;->access$600(Lcom/shopkick/app/location/LocationMapScreen;)Landroid/view/ViewGroup;

    move-result-object v1

    const/4 v2, 0x0

    .line 349
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    const v0, 0x7f090468

    .line 352
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f090467

    .line 353
    invoke-virtual {p1, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f1103c8

    .line 354
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 355
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen$4;->this$0:Lcom/shopkick/app/location/LocationMapScreen;

    invoke-static {v0}, Lcom/shopkick/app/location/LocationMapScreen;->access$700(Lcom/shopkick/app/location/LocationMapScreen;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
