.class public abstract Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPersistedState;
.super Ljava/lang/Object;
.source "DebugFeatureFlagPersistedState.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPersistedState;
    .locals 1

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public abstract getTestName()Ljava/lang/String;
.end method
