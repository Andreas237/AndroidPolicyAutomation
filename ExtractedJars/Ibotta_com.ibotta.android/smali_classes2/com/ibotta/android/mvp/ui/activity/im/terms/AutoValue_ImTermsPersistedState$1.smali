.class Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState$1;
.super Ljava/lang/Object;
.source "AutoValue_ImTermsPersistedState.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;",
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
.method public createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;
    .locals 2

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;

    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;I)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState$1;->createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;
    .locals 0

    .line 19
    new-array p1, p1, [Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState$1;->newArray(I)[Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;

    move-result-object p1

    return-object p1
.end method
