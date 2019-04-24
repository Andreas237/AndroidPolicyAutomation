.class Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginParcel$1;
.super Ljava/lang/Object;
.source "AutoValue_ImLoginParcel.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginParcel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginParcel;",
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
.method public createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginParcel;
    .locals 2

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginParcel;

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginParcel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginParcel$1;->createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginParcel;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginParcel;
    .locals 0

    .line 19
    new-array p1, p1, [Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginParcel;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginParcel$1;->newArray(I)[Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginParcel;

    move-result-object p1

    return-object p1
.end method
