.class Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState$1;
.super Ljava/lang/Object;
.source "AutoValue_DebugFeatureFlagPersistedState.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState;
    .locals 1

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState;

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState$1;->createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState;
    .locals 0

    .line 18
    new-array p1, p1, [Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState$1;->newArray(I)[Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState;

    move-result-object p1

    return-object p1
.end method
