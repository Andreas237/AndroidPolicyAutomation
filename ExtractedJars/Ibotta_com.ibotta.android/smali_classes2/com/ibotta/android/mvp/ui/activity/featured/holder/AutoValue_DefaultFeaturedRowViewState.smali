.class final Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_DefaultFeaturedRowViewState;
.super Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState;
.source "AutoValue_DefaultFeaturedRowViewState.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_DefaultFeaturedRowViewState$Builder;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_DefaultFeaturedRowViewState$1;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_DefaultFeaturedRowViewState;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 25
    :cond_0
    instance-of p1, p1, Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState;

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "DefaultFeaturedRowViewState{}"

    return-object v0
.end method
