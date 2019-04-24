.class final Lcom/shopkick/sdk/campaign/MessageParcelable$1;
.super Ljava/lang/Object;
.source "MessageParcelable.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/campaign/MessageParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/shopkick/sdk/campaign/MessageParcelable;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 271
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/shopkick/sdk/campaign/MessageParcelable;
    .locals 2

    .line 274
    new-instance v0, Lcom/shopkick/sdk/campaign/MessageParcelable;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/shopkick/sdk/campaign/MessageParcelable;-><init>(Landroid/os/Parcel;Lcom/shopkick/sdk/campaign/MessageParcelable$1;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 271
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/campaign/MessageParcelable$1;->createFromParcel(Landroid/os/Parcel;)Lcom/shopkick/sdk/campaign/MessageParcelable;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/shopkick/sdk/campaign/MessageParcelable;
    .locals 0

    .line 279
    new-array p1, p1, [Lcom/shopkick/sdk/campaign/MessageParcelable;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 271
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/campaign/MessageParcelable$1;->newArray(I)[Lcom/shopkick/sdk/campaign/MessageParcelable;

    move-result-object p1

    return-object p1
.end method
