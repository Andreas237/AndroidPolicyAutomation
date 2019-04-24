.class Lcom/shopkick/sdk/sensor/GeoFencingIntentService$1;
.super Ljava/lang/Object;
.source "GeoFencingIntentService.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->onHandleWork(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/GeoFencingIntentService;

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/GeoFencingIntentService;Landroid/content/Intent;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFencingIntentService$1;->this$0:Lcom/shopkick/sdk/sensor/GeoFencingIntentService;

    iput-object p2, p0, Lcom/shopkick/sdk/sensor/GeoFencingIntentService$1;->val$intent:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFencingIntentService$1;->this$0:Lcom/shopkick/sdk/sensor/GeoFencingIntentService;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFencingIntentService$1;->val$intent:Landroid/content/Intent;

    invoke-static {v0, v1}, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->access$000(Lcom/shopkick/sdk/sensor/GeoFencingIntentService;Landroid/content/Intent;)V

    return-void
.end method
