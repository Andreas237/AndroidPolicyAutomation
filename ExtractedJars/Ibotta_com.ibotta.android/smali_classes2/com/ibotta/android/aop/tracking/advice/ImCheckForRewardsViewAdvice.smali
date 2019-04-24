.class public Lcom/ibotta/android/aop/tracking/advice/ImCheckForRewardsViewAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/ImViewEventAdvice;
.source "ImCheckForRewardsViewAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 1

    const-string v0, "CheckForRewardsAlert"

    .line 12
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/aop/tracking/advice/ImViewEventAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Ljava/lang/String;)V

    return-void
.end method
