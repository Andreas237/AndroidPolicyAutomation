.class Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$1;
.super Ljava/lang/Object;
.source "ReceiptProductSelectorScreen.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$002(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;Ljava/lang/Double;)Ljava/lang/Double;

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$102(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;Ljava/lang/Double;)Ljava/lang/Double;

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$200(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Landroid/location/Location;

    move-result-object v0

    if-nez v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-static {v0, p1}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$202(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;Landroid/location/Location;)Landroid/location/Location;

    .line 106
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$300(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    move-result-object p1

    iget-object p1, p1, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->dataSource:Lcom/shopkick/app/receipts/KickbateItemDataSource;

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$000(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Ljava/lang/Double;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-static {v1}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$100(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/receipts/KickbateItemDataSource;->setCoordinate(Ljava/lang/Double;Ljava/lang/Double;)V

    .line 107
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$300(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->fetchNextPage()V

    .line 109
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$400(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Landroid/widget/RelativeLayout;

    move-result-object p1

    const v0, 0x7f09054a

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 110
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/shopkick/sdk/presence/LocationManager;->cancelLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    :cond_1
    return-void
.end method
