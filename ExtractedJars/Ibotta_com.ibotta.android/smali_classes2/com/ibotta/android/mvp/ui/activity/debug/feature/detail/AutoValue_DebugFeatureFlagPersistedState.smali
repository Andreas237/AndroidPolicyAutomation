.class final Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState;
.super Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/$AutoValue_DebugFeatureFlagPersistedState;
.source "AutoValue_DebugFeatureFlagPersistedState.java"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState$1;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/$AutoValue_DebugFeatureFlagPersistedState;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/AutoValue_DebugFeatureFlagPersistedState;->getTestName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
