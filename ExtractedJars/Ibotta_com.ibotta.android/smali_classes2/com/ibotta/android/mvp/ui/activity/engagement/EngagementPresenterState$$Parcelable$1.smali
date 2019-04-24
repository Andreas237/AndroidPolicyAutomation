.class Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable$1;
.super Ljava/lang/Object;
.source "EngagementPresenterState$$Parcelable.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;",
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
.method public createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;
    .locals 2

    .line 29
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;

    new-instance v1, Lorg/parceler/IdentityCollection;

    invoke-direct {v1}, Lorg/parceler/IdentityCollection;-><init>()V

    invoke-static {p1, v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;->read(Landroid/os/Parcel;Lorg/parceler/IdentityCollection;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;-><init>(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable$1;->createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;
    .locals 0

    .line 34
    new-array p1, p1, [Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable$1;->newArray(I)[Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;

    move-result-object p1

    return-object p1
.end method
