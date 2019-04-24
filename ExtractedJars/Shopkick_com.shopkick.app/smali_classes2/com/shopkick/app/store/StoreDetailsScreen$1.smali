.class Lcom/shopkick/app/store/StoreDetailsScreen$1;
.super Ljava/lang/Object;
.source "StoreDetailsScreen.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/StoreDetailsScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/StoreDetailsScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/StoreDetailsScreen;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen$1;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 175
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen$1;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->access$000(Lcom/shopkick/app/store/StoreDetailsScreen;)Lcom/shopkick/app/store/StoreDetailsAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->fetchNextPage()V

    goto :goto_0

    .line 177
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen$1;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->disableScreenResponsivenessLogging()V

    .line 178
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen$1;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->access$100(Lcom/shopkick/app/store/StoreDetailsScreen;)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method
