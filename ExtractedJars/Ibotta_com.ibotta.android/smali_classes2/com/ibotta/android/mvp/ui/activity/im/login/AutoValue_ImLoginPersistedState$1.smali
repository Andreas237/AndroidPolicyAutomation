.class Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState$1;
.super Ljava/lang/Object;
.source "AutoValue_ImLoginPersistedState.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;
    .locals 5

    .line 11
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, v4, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 14
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-ne p1, v4, :cond_1

    const/4 v3, 0x1

    :cond_1
    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;-><init>(IZZ)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState$1;->createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;
    .locals 0

    .line 19
    new-array p1, p1, [Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState$1;->newArray(I)[Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;

    move-result-object p1

    return-object p1
.end method
