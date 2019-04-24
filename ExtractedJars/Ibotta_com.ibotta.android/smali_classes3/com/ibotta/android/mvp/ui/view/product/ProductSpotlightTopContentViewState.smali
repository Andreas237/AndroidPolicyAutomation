.class public abstract Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;
.super Ljava/lang/Object;
.source "ProductSpotlightTopContentViewState.java"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/product/AutoValue_ProductSpotlightTopContentViewState;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/product/AutoValue_ProductSpotlightTopContentViewState;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public abstract getDescription()Ljava/lang/String;
.end method

.method public abstract getImageUrl()Ljava/lang/String;
.end method
