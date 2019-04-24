.class public Lcom/ibotta/android/service/api/job/ApiJobListenerComparator;
.super Ljava/lang/Object;
.source "ApiJobListenerComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/android/service/api/job/ApiJobListener;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/android/service/api/job/ApiJobListener;Lcom/ibotta/android/service/api/job/ApiJobListener;)I
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-nez p1, :cond_1

    return v1

    :cond_1
    const/4 v2, -0x1

    if-nez p2, :cond_2

    return v2

    .line 17
    :cond_2
    instance-of p1, p1, Lcom/ibotta/android/service/api/job/ApiJobConsumerListener;

    if-eqz p1, :cond_3

    instance-of v3, p2, Lcom/ibotta/android/service/api/job/ApiJobConsumerListener;

    if-eqz v3, :cond_3

    return v0

    :cond_3
    if-eqz p1, :cond_4

    return v2

    .line 21
    :cond_4
    instance-of p1, p2, Lcom/ibotta/android/service/api/job/ApiJobConsumerListener;

    if-eqz p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/service/api/job/ApiJobListener;

    check-cast p2, Lcom/ibotta/android/service/api/job/ApiJobListener;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/service/api/job/ApiJobListenerComparator;->compare(Lcom/ibotta/android/service/api/job/ApiJobListener;Lcom/ibotta/android/service/api/job/ApiJobListener;)I

    move-result p1

    return p1
.end method
