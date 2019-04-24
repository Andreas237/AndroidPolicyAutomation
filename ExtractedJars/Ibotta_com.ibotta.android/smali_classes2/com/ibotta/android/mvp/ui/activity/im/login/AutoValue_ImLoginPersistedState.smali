.class final Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;
.super Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;
.source "AutoValue_ImLoginPersistedState.java"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 8
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState$1;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IZZ)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;-><init>(IZZ)V

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

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;->getRetailerId()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 31
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;->isAccountCreationMessageAlreadyShown()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 32
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;->isFromCreate()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
