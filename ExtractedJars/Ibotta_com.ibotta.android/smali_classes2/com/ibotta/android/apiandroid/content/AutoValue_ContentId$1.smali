.class Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId$1;
.super Ljava/lang/Object;
.source "AutoValue_ContentId.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;",
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
.method public createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;
    .locals 3

    .line 12
    new-instance v0, Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;-><init>(IILjava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId$1;->createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;
    .locals 0

    .line 20
    new-array p1, p1, [Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId$1;->newArray(I)[Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;

    move-result-object p1

    return-object p1
.end method
