.class public abstract Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;
.super Ljava/lang/Object;
.source "FeaturedSSViewState.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;
    }
.end annotation


# static fields
.field public static EMPTY:Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 12
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 13
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;->savedState(Landroid/os/Parcelable;)Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;

    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;
    .locals 1

    .line 19
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_FeaturedSSViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_FeaturedSSViewState$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getSavedState()Landroid/os/Parcelable;
.end method
