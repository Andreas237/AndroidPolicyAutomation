.class public abstract Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;
.super Ljava/lang/Object;
.source "ImLoginParcel.java"

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

.method public static create(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginParcel;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginParcel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public abstract getPassword()Ljava/lang/String;
.end method

.method public abstract getUserName()Ljava/lang/String;
.end method
