.class public final synthetic Lcom/shopkick/app/presence/-$$Lambda$jhFex3gsnEBUUFbY1NG5CRHhj-Y;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/presence/-$$Lambda$jhFex3gsnEBUUFbY1NG5CRHhj-Y;->f$0:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

    return-void
.end method


# virtual methods
.method public final onLocationUpdated(Landroid/location/Location;)V
    .locals 1

    iget-object v0, p0, Lcom/shopkick/app/presence/-$$Lambda$jhFex3gsnEBUUFbY1NG5CRHhj-Y;->f$0:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->handleLocationUpdate(Landroid/location/Location;)V

    return-void
.end method
