.class final Lcom/shopkick/app/btledetector/BTLEDetectorScreen$2;
.super Ljava/lang/Object;
.source "BTLEDetectorScreen.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/btledetector/BTLEDetectorScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/shopkick/sdk/scanner/Beacon;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/shopkick/sdk/scanner/Beacon;Lcom/shopkick/sdk/scanner/Beacon;)I
    .locals 2

    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    .line 202
    invoke-virtual {p2, v0, v1}, Lcom/shopkick/sdk/scanner/Beacon;->getSignalStrength(D)I

    move-result p2

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/sdk/scanner/Beacon;->getSignalStrength(D)I

    move-result p1

    sub-int/2addr p2, p1

    return p2
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 194
    check-cast p1, Lcom/shopkick/sdk/scanner/Beacon;

    check-cast p2, Lcom/shopkick/sdk/scanner/Beacon;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$2;->compare(Lcom/shopkick/sdk/scanner/Beacon;Lcom/shopkick/sdk/scanner/Beacon;)I

    move-result p1

    return p1
.end method
