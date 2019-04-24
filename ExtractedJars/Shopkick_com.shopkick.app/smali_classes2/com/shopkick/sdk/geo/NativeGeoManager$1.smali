.class Lcom/shopkick/sdk/geo/NativeGeoManager$1;
.super Ljava/lang/Object;
.source "NativeGeoManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/geo/NativeGeoManager;->getCurrentLocation(Lcom/shopkick/app/util/Consumer;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/geo/NativeGeoManager;

.field final synthetic val$listener:Lcom/shopkick/app/util/Consumer;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/geo/NativeGeoManager;Lcom/shopkick/app/util/Consumer;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/shopkick/sdk/geo/NativeGeoManager$1;->this$0:Lcom/shopkick/sdk/geo/NativeGeoManager;

    iput-object p2, p0, Lcom/shopkick/sdk/geo/NativeGeoManager$1;->val$listener:Lcom/shopkick/app/util/Consumer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 59
    iget-object v0, p0, Lcom/shopkick/sdk/geo/NativeGeoManager$1;->this$0:Lcom/shopkick/sdk/geo/NativeGeoManager;

    iget-object v1, p0, Lcom/shopkick/sdk/geo/NativeGeoManager$1;->val$listener:Lcom/shopkick/app/util/Consumer;

    invoke-static {v0, v1}, Lcom/shopkick/sdk/geo/NativeGeoManager;->access$000(Lcom/shopkick/sdk/geo/NativeGeoManager;Lcom/shopkick/app/util/Consumer;)V

    return-void
.end method
