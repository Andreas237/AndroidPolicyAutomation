.class Lcom/shopkick/app/receipts/ReceiptRulesScreenV2$1;
.super Ljava/lang/Object;
.source "ReceiptRulesScreenV2.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2$1;->this$0:Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2$1;->this$0:Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->access$002(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;Ljava/lang/Double;)Ljava/lang/Double;

    .line 74
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2$1;->this$0:Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->access$102(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;Ljava/lang/Double;)Ljava/lang/Double;

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2$1;->this$0:Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->access$200(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;)Landroid/location/Location;

    move-result-object v0

    if-nez v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2$1;->this$0:Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;

    invoke-static {v0, p1}, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->access$202(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;Landroid/location/Location;)Landroid/location/Location;

    .line 77
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2$1;->this$0:Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->access$300(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;)Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    move-result-object p1

    iget-object p1, p1, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->dataSource:Lcom/shopkick/app/receipts/KickbateItemDataSource;

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2$1;->this$0:Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->access$000(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;)Ljava/lang/Double;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2$1;->this$0:Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;

    invoke-static {v1}, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->access$100(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/receipts/KickbateItemDataSource;->setCoordinate(Ljava/lang/Double;Ljava/lang/Double;)V

    .line 78
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2$1;->this$0:Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->access$300(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;)Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->fetchNextPage()V

    .line 80
    :cond_0
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/shopkick/sdk/presence/LocationManager;->cancelLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    :cond_1
    return-void
.end method
