.class final Lcom/shopkick/sdk/sensor/BLESensorService$1;
.super Ljava/lang/Object;
.source "BLESensorService.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/AppStateProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/BLESensorService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public addStateListener(Lcom/shopkick/sdk/presence/AppStateListener;)V
    .locals 0

    return-void
.end method

.method public isAppInForeground()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public removeStateListener(Lcom/shopkick/sdk/presence/AppStateListener;)V
    .locals 0

    return-void
.end method
