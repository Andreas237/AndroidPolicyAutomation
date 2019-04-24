.class public abstract Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;
.super Ljava/lang/Object;
.source "ImLoginPersistedState.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract accountCreationMessageAlreadyShown(Z)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;
.end method

.method public abstract build()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;
.end method

.method public abstract fromCreate(Z)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;
.end method

.method public abstract retailerId(I)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;
.end method
