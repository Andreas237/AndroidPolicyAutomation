.class public Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;
.super Ljava/lang/Object;
.source "DeviceInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/DeviceInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AdvertisingInfo"
.end annotation


# instance fields
.field public advertisingId:Ljava/lang/String;

.field public encryptedAdvertisingId:Ljava/lang/String;

.field public isLimitAdTrackingEnabled:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 644
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 645
    iput-object v0, p0, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;->advertisingId:Ljava/lang/String;

    .line 646
    iput-object v0, p0, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;->encryptedAdvertisingId:Ljava/lang/String;

    const/4 v0, 0x1

    .line 649
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;->isLimitAdTrackingEnabled:Ljava/lang/Boolean;

    return-void
.end method
