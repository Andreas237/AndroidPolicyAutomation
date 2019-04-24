.class public abstract Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;
.super Ljava/lang/Object;
.source "FeaturedSSViewState.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;
.end method

.method public abstract savedState(Landroid/os/Parcelable;)Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;
.end method
