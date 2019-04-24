.class final Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;
.super Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;
.source "AutoValue_ContentId.java"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    new-instance v0, Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId$1;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;-><init>(IILjava/lang/String;)V

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
    invoke-virtual {p0}, Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;->getIdType()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 31
    invoke-virtual {p0}, Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;->getInternalIntId()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 32
    invoke-virtual {p0}, Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;->getInternalStringId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
