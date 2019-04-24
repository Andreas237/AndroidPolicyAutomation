.class public abstract Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;
.super Ljava/lang/Object;
.source "ImTermsPersistedState.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;I)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsPersistedState;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;I)V

    return-object v0
.end method


# virtual methods
.method public abstract getImLoginParcel()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;
.end method

.method public abstract getRetailerId()I
.end method
