.class Lcom/shopkick/app/presence/PresenceController$1;
.super Ljava/lang/Object;
.source "PresenceController.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/presence/PresenceController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/presence/PresenceController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/presence/PresenceController;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/shopkick/app/presence/PresenceController$1;->this$0:Lcom/shopkick/app/presence/PresenceController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController$1;->this$0:Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/presence/PresenceController;->handleLocationUpdate(Landroid/location/Location;)V

    return-void
.end method
