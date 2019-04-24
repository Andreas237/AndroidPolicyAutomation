.class public Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;
.super Ljava/lang/Object;
.source "WalkinController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/presence/WalkinController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "GeoFenceMappedValue"
.end annotation


# instance fields
.field private checkinLocation:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

.field private walkinTimestamp:J


# direct methods
.method protected constructor <init>(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;J)V
    .locals 0

    .line 838
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 839
    iput-wide p2, p0, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;->walkinTimestamp:J

    .line 840
    iput-object p1, p0, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;->checkinLocation:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;)Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;
    .locals 0

    .line 834
    iget-object p0, p0, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;->checkinLocation:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    return-object p0
.end method


# virtual methods
.method protected getCheckinLocation()Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;
    .locals 1

    .line 844
    iget-object v0, p0, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;->checkinLocation:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    return-object v0
.end method

.method protected getWalkinTimestamp()J
    .locals 2

    .line 848
    iget-wide v0, p0, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;->walkinTimestamp:J

    return-wide v0
.end method
