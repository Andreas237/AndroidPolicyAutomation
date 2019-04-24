.class public abstract Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;
.super Ljava/lang/Object;
.source "ImLoginPersistedState.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;
    .locals 1

    .line 16
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getRetailerId()I
.end method

.method public abstract isAccountCreationMessageAlreadyShown()Z
.end method

.method public abstract isFromCreate()Z
.end method

.method public abstract toBuilder()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;
.end method
