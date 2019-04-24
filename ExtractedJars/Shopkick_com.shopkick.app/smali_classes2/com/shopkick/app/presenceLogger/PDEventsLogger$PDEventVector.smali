.class public Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;
.super Ljava/lang/Object;
.source "PDEventsLogger.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/presenceLogger/PDEventsLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "PDEventVector"
.end annotation


# instance fields
.field private eventCode:I

.field private locationIndex:I

.field private presenceCodeIndex:I

.field final synthetic this$0:Lcom/shopkick/app/presenceLogger/PDEventsLogger;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/presenceLogger/PDEventsLogger;III)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;->this$0:Lcom/shopkick/app/presenceLogger/PDEventsLogger;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput p2, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;->eventCode:I

    .line 36
    iput p3, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;->presenceCodeIndex:I

    .line 37
    iput p4, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;->locationIndex:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 42
    check-cast p1, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;

    .line 43
    iget v0, p1, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;->presenceCodeIndex:I

    iget v1, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;->presenceCodeIndex:I

    if-ne v0, v1, :cond_0

    iget v0, p1, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;->locationIndex:I

    iget v1, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;->locationIndex:I

    if-ne v0, v1, :cond_0

    iget p1, p1, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;->eventCode:I

    iget v0, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;->eventCode:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 60
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "(%d, %d, %d)"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;->presenceCodeIndex:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;->locationIndex:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget v3, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;->eventCode:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
