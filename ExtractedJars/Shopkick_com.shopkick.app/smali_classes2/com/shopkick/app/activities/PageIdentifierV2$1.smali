.class final Lcom/shopkick/app/activities/PageIdentifierV2$1;
.super Ljava/lang/Object;
.source "PageIdentifierV2.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/activities/PageIdentifierV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/shopkick/app/activities/PageIdentifierV2;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/shopkick/app/activities/PageIdentifierV2;
    .locals 2

    .line 27
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Landroid/os/Parcel;Lcom/shopkick/app/activities/PageIdentifierV2$1;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/PageIdentifierV2$1;->createFromParcel(Landroid/os/Parcel;)Lcom/shopkick/app/activities/PageIdentifierV2;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/shopkick/app/activities/PageIdentifierV2;
    .locals 0

    .line 32
    new-array p1, p1, [Lcom/shopkick/app/activities/PageIdentifierV2;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/PageIdentifierV2$1;->newArray(I)[Lcom/shopkick/app/activities/PageIdentifierV2;

    move-result-object p1

    return-object p1
.end method
