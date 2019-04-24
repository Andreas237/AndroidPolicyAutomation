.class final Lio/branch/indexing/BranchUniversalObject$1;
.super Ljava/lang/Object;
.source "BranchUniversalObject.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/indexing/BranchUniversalObject;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 897
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lio/branch/indexing/BranchUniversalObject;
    .locals 2

    .line 899
    new-instance v0, Lio/branch/indexing/BranchUniversalObject;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lio/branch/indexing/BranchUniversalObject;-><init>(Landroid/os/Parcel;Lio/branch/indexing/BranchUniversalObject$1;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 897
    invoke-virtual {p0, p1}, Lio/branch/indexing/BranchUniversalObject$1;->createFromParcel(Landroid/os/Parcel;)Lio/branch/indexing/BranchUniversalObject;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lio/branch/indexing/BranchUniversalObject;
    .locals 0

    .line 903
    new-array p1, p1, [Lio/branch/indexing/BranchUniversalObject;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 897
    invoke-virtual {p0, p1}, Lio/branch/indexing/BranchUniversalObject$1;->newArray(I)[Lio/branch/indexing/BranchUniversalObject;

    move-result-object p1

    return-object p1
.end method
