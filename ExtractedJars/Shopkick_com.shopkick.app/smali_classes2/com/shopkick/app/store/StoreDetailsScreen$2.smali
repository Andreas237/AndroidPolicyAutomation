.class Lcom/shopkick/app/store/StoreDetailsScreen$2;
.super Lcom/shopkick/app/widget/ToolTipView;
.source "StoreDetailsScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/StoreDetailsScreen;->showRetailerReceiptToolTip()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/StoreDetailsScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/StoreDetailsScreen;Landroid/view/ViewGroup;Landroid/view/View;I)V
    .locals 0

    .line 774
    iput-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen$2;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-direct {p0, p2, p3, p4}, Lcom/shopkick/app/widget/ToolTipView;-><init>(Landroid/view/ViewGroup;Landroid/view/View;I)V

    return-void
.end method


# virtual methods
.method public after(Lcom/shopkick/app/widget/ToolTipView;)V
    .locals 2

    .line 776
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen$2;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->access$200(Lcom/shopkick/app/store/StoreDetailsScreen;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object p1

    const-string/jumbo v0, "store_details_retailer_receipt_tooltip_shown"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/AppPreferences;->putBoolean(Ljava/lang/String;Z)V

    .line 777
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen$2;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/store/StoreDetailsScreen;->access$302(Lcom/shopkick/app/store/StoreDetailsScreen;Lcom/shopkick/app/widget/ToolTipView;)Lcom/shopkick/app/widget/ToolTipView;

    return-void
.end method
