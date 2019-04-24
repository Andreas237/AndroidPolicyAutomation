.class final Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;
.super Lcom/ibotta/android/mvp/ui/activity/im/terms/$AutoValue_ImTermsPersistedState;
.source "AutoValue_ImTermsPersistedState.java"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState$1;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/terms/$AutoValue_ImTermsPersistedState;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;I)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 29
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;->getImLoginParcel()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;->getRetailerId()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
