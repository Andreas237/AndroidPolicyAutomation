.class Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource$1;
.super Ljava/lang/Object;
.source "ScanBCDataSource.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource$1;->this$0:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource$1;->this$0:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-static {v0, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->access$000(Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Landroid/location/Location;)V

    return-void
.end method
