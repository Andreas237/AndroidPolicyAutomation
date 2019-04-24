.class Lcom/shopkick/app/chains/ChainDataSource$1;
.super Ljava/lang/Object;
.source "ChainDataSource.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/chains/ChainDataSource;
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

    .line 41
    iput-object p1, p0, Lcom/shopkick/app/chains/ChainDataSource$1;->this$0:Lcom/shopkick/app/chains/ChainDataSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainDataSource$1;->this$0:Lcom/shopkick/app/chains/ChainDataSource;

    invoke-static {v0, p1}, Lcom/shopkick/app/chains/ChainDataSource;->access$000(Lcom/shopkick/app/chains/ChainDataSource;Landroid/location/Location;)V

    return-void
.end method
