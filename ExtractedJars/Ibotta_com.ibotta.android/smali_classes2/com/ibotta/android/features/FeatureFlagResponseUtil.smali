.class public interface abstract Lcom/ibotta/android/features/FeatureFlagResponseUtil;
.super Ljava/lang/Object;
.source "FeatureFlagResponseUtil.java"


# virtual methods
.method public abstract getFeatureFlagFieldOrDefault(Ljava/lang/String;Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;",
            "Ljava9/util/function/Function<",
            "Lcom/ibotta/android/state/app/featureflag/FeatureFlag;",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract getFeatureFlagInfoByName(Ljava/util/Map;Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/featureflag/FeatureFlag;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/ibotta/android/state/app/featureflag/FeatureFlag;"
        }
    .end annotation
.end method

.method public abstract getVariantInfoFieldOrDefault(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "TT;",
            "Ljava9/util/function/Function<",
            "Lcom/ibotta/android/state/app/featureflag/VariantInfo;",
            "TT;>;)TT;"
        }
    .end annotation
.end method
