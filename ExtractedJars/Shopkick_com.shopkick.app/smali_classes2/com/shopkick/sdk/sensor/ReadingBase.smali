.class abstract Lcom/shopkick/sdk/sensor/ReadingBase;
.super Ljava/lang/Object;
.source "ReadingBase.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/Reading;


# static fields
.field private static final MaxReadingHistory:I = 0x28


# instance fields
.field private previousReading:Lcom/shopkick/sdk/sensor/ReadingBase;

.field private final timestamp:J


# direct methods
.method protected constructor <init>(Lcom/shopkick/sdk/sensor/ReadingBase;)V
    .locals 3

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/sdk/sensor/ReadingBase;->timestamp:J

    .line 21
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ReadingBase;->previousReading:Lcom/shopkick/sdk/sensor/ReadingBase;

    const/4 v0, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 29
    iget-object v1, p1, Lcom/shopkick/sdk/sensor/ReadingBase;->previousReading:Lcom/shopkick/sdk/sensor/ReadingBase;

    const/16 v2, 0x28

    if-le v0, v2, :cond_0

    const/4 v2, 0x0

    .line 31
    iput-object v2, p1, Lcom/shopkick/sdk/sensor/ReadingBase;->previousReading:Lcom/shopkick/sdk/sensor/ReadingBase;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    move-object p1, v1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public getPreviousReading()Lcom/shopkick/sdk/sensor/Reading;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ReadingBase;->previousReading:Lcom/shopkick/sdk/sensor/ReadingBase;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    .line 40
    iget-wide v0, p0, Lcom/shopkick/sdk/sensor/ReadingBase;->timestamp:J

    return-wide v0
.end method
