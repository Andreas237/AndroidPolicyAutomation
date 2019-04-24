.class public abstract Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState;
.super Ljava/lang/Object;
.source "DefaultFeaturedRowViewState.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState$Builder;
    }
.end annotation


# static fields
.field public static EMPTY:Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState$Builder;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState$Builder;
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_DefaultFeaturedRowViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_DefaultFeaturedRowViewState$Builder;-><init>()V

    return-object v0
.end method
