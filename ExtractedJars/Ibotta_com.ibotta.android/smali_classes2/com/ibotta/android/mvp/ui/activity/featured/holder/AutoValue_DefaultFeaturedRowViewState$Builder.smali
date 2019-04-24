.class final Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_DefaultFeaturedRowViewState$Builder;
.super Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState$Builder;
.source "AutoValue_DefaultFeaturedRowViewState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_DefaultFeaturedRowViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState;
    .locals 2

    .line 42
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_DefaultFeaturedRowViewState;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_DefaultFeaturedRowViewState;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_DefaultFeaturedRowViewState$1;)V

    return-object v0
.end method
