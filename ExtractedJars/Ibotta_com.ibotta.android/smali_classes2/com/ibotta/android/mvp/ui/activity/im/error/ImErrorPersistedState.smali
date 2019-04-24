.class public abstract Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;
.super Ljava/lang/Object;
.source "ImErrorPersistedState.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(I)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;
    .locals 1

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/AutoValue_ImErrorPersistedState;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/AutoValue_ImErrorPersistedState;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public abstract getRetailerId()I
.end method
