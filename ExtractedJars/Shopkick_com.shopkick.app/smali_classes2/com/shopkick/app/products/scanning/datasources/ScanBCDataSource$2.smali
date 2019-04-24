.class Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource$2;
.super Ljava/lang/Object;
.source "ScanBCDataSource.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;-><init>(Landroid/content/Context;Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/awards/AwardsManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/AppPreferences;)V
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

    .line 153
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource$2;->this$0:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource$2;->this$0:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-static {v0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->access$100(Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;)V

    return-void
.end method
