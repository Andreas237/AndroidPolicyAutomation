.class Lcom/shopkick/app/logging/UserAcquisitionReporter$Event;
.super Ljava/lang/Object;
.source "UserAcquisitionReporter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/logging/UserAcquisitionReporter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "Event"
.end annotation


# instance fields
.field eventType:I

.field secsFromUtc:I

.field final synthetic this$0:Lcom/shopkick/app/logging/UserAcquisitionReporter;

.field tz:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/logging/UserAcquisitionReporter;IILjava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter$Event;->this$0:Lcom/shopkick/app/logging/UserAcquisitionReporter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput p2, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter$Event;->eventType:I

    .line 37
    iput p3, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter$Event;->secsFromUtc:I

    .line 38
    iput-object p4, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter$Event;->tz:Ljava/lang/String;

    return-void
.end method
