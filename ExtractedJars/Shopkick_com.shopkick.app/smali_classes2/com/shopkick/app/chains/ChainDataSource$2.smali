.class Lcom/shopkick/app/chains/ChainDataSource$2;
.super Ljava/lang/Object;
.source "ChainDataSource.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/chains/ChainDataSource;-><init>(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/chains/ChainDataSource;


# direct methods
.method constructor <init>(Lcom/shopkick/app/chains/ChainDataSource;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/shopkick/app/chains/ChainDataSource$2;->this$0:Lcom/shopkick/app/chains/ChainDataSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainDataSource$2;->this$0:Lcom/shopkick/app/chains/ChainDataSource;

    invoke-static {v0}, Lcom/shopkick/app/chains/ChainDataSource;->access$100(Lcom/shopkick/app/chains/ChainDataSource;)V

    return-void
.end method
