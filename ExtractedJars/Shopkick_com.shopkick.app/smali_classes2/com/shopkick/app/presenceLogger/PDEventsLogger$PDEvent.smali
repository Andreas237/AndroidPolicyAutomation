.class public Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEvent;
.super Ljava/lang/Object;
.source "PDEventsLogger.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/presenceLogger/PDEventsLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "PDEvent"
.end annotation


# instance fields
.field eventTime:J

.field eventVectorIndex:I

.field final synthetic this$0:Lcom/shopkick/app/presenceLogger/PDEventsLogger;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/presenceLogger/PDEventsLogger;IJ)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEvent;->this$0:Lcom/shopkick/app/presenceLogger/PDEventsLogger;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput p2, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEvent;->eventVectorIndex:I

    .line 73
    iput-wide p3, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEvent;->eventTime:J

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 5

    .line 82
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "(%d, %d)"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-wide v3, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEvent;->eventTime:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEvent;->eventVectorIndex:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
