.class Lcom/shopkick/sdk/zone/ZoneManager$3;
.super Ljava/lang/Object;
.source "ZoneManager.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/zone/ZoneManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/zone/ZoneManager;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/zone/ZoneManager;)V
    .locals 0

    .line 808
    iput-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager$3;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 1

    .line 811
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager$3;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    invoke-static {v0, p1}, Lcom/shopkick/sdk/zone/ZoneManager;->access$300(Lcom/shopkick/sdk/zone/ZoneManager;Landroid/location/Location;)V

    return-void
.end method
