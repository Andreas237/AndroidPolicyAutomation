.class Lcom/ibotta/android/tracking/proprietary/event/TrackType$TrackTypeException;
.super Ljava/lang/Exception;
.source "TrackType.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/proprietary/event/TrackType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TrackTypeException"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/tracking/proprietary/event/TrackType;


# direct methods
.method constructor <init>(Lcom/ibotta/android/tracking/proprietary/event/TrackType;Ljava/lang/String;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackType$TrackTypeException;->this$0:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 210
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-void
.end method
