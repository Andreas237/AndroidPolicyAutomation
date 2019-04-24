.class Lcom/shopkick/sdk/zone/ZoneManager$2$1;
.super Ljava/lang/Object;
.source "ZoneManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/zone/ZoneManager$2;->completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/sdk/zone/ZoneManager$2;

.field final synthetic val$response:Lcom/shopkick/fetchers/DataResponse;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/zone/ZoneManager$2;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 797
    iput-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager$2$1;->this$1:Lcom/shopkick/sdk/zone/ZoneManager$2;

    iput-object p2, p0, Lcom/shopkick/sdk/zone/ZoneManager$2$1;->val$response:Lcom/shopkick/fetchers/DataResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 800
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager$2$1;->this$1:Lcom/shopkick/sdk/zone/ZoneManager$2;

    iget-object v0, v0, Lcom/shopkick/sdk/zone/ZoneManager$2;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneManager$2$1;->val$response:Lcom/shopkick/fetchers/DataResponse;

    invoke-static {v0, v1}, Lcom/shopkick/sdk/zone/ZoneManager;->access$100(Lcom/shopkick/sdk/zone/ZoneManager;Lcom/shopkick/fetchers/DataResponse;)V

    return-void
.end method
