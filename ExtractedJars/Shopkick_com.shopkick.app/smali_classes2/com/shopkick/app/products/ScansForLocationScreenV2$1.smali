.class Lcom/shopkick/app/products/ScansForLocationScreenV2$1;
.super Ljava/lang/Object;
.source "ScansForLocationScreenV2.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/ScansForLocationScreenV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/products/ScansForLocationScreenV2;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/ScansForLocationScreenV2;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2$1;->this$0:Lcom/shopkick/app/products/ScansForLocationScreenV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2$1;->this$0:Lcom/shopkick/app/products/ScansForLocationScreenV2;

    invoke-static {v0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->access$000(Lcom/shopkick/app/products/ScansForLocationScreenV2;)Landroid/location/Location;

    move-result-object v0

    if-nez v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2$1;->this$0:Lcom/shopkick/app/products/ScansForLocationScreenV2;

    invoke-static {v0, p1}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->access$002(Lcom/shopkick/app/products/ScansForLocationScreenV2;Landroid/location/Location;)Landroid/location/Location;

    .line 101
    iget-object p1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2$1;->this$0:Lcom/shopkick/app/products/ScansForLocationScreenV2;

    invoke-static {p1}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->access$100(Lcom/shopkick/app/products/ScansForLocationScreenV2;)V

    :cond_0
    return-void
.end method
