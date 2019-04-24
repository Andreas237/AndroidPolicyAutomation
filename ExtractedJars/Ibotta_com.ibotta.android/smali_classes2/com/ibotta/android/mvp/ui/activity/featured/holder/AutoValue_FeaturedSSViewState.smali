.class final Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_FeaturedSSViewState;
.super Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;
.source "AutoValue_FeaturedSSViewState.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_FeaturedSSViewState$Builder;
    }
.end annotation


# instance fields
.field private final savedState:Landroid/os/Parcelable;


# direct methods
.method private constructor <init>(Landroid/os/Parcelable;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_FeaturedSSViewState;->savedState:Landroid/os/Parcelable;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcelable;Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_FeaturedSSViewState$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_FeaturedSSViewState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 35
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;

    if-eqz v0, :cond_1

    .line 36
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_FeaturedSSViewState;->savedState:Landroid/os/Parcelable;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;->getSavedState()Landroid/os/Parcelable;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getSavedState()Landroid/os/Parcelable;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_FeaturedSSViewState;->savedState:Landroid/os/Parcelable;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_FeaturedSSViewState;->savedState:Landroid/os/Parcelable;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FeaturedSSViewState{savedState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AutoValue_FeaturedSSViewState;->savedState:Landroid/os/Parcelable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
