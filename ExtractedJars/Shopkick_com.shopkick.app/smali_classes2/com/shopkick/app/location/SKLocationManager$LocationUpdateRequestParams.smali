.class public Lcom/shopkick/app/location/SKLocationManager$LocationUpdateRequestParams;
.super Ljava/lang/Object;
.source "SKLocationManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/location/SKLocationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LocationUpdateRequestParams"
.end annotation


# instance fields
.field public minDistance:F

.field public minTime:J

.field public priority:I

.field final synthetic this$0:Lcom/shopkick/app/location/SKLocationManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/location/SKLocationManager;JFI)V
    .locals 0

    .line 373
    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager$LocationUpdateRequestParams;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 374
    iput-wide p2, p0, Lcom/shopkick/app/location/SKLocationManager$LocationUpdateRequestParams;->minTime:J

    .line 375
    iput p4, p0, Lcom/shopkick/app/location/SKLocationManager$LocationUpdateRequestParams;->minDistance:F

    .line 376
    iput p5, p0, Lcom/shopkick/app/location/SKLocationManager$LocationUpdateRequestParams;->priority:I

    return-void
.end method
