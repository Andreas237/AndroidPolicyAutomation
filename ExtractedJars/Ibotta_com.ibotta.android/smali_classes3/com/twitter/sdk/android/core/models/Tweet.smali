.class public Lcom/twitter/sdk/android/core/models/Tweet;
.super Ljava/lang/Object;
.source "Tweet.java"

# interfaces
.implements Lcom/twitter/sdk/android/core/models/Identifiable;


# instance fields
.field public final id:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 290
    :cond_0
    instance-of v1, p1, Lcom/twitter/sdk/android/core/models/Tweet;

    if-nez v1, :cond_1

    return v0

    .line 291
    :cond_1
    check-cast p1, Lcom/twitter/sdk/android/core/models/Tweet;

    .line 292
    iget-wide v1, p0, Lcom/twitter/sdk/android/core/models/Tweet;->id:J

    iget-wide v3, p1, Lcom/twitter/sdk/android/core/models/Tweet;->id:J

    cmp-long p1, v1, v3

    if-nez p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public getId()J
    .locals 2

    .line 284
    iget-wide v0, p0, Lcom/twitter/sdk/android/core/models/Tweet;->id:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    .line 297
    iget-wide v0, p0, Lcom/twitter/sdk/android/core/models/Tweet;->id:J

    long-to-int v1, v0

    return v1
.end method
