.class public Lcom/ibotta/android/features/storage/DebugFeatureFlagState;
.super Ljava/lang/Object;
.source "DebugFeatureFlagState.java"


# instance fields
.field private enabled:Z

.field private variantName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "control"

    .line 10
    iput-object v0, p0, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;->variantName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getVariantName()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;->variantName:Ljava/lang/String;

    return-object v0
.end method

.method public isEnabled()Z
    .locals 1

    .line 13
    iget-boolean v0, p0, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;->enabled:Z

    return v0
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 17
    iput-boolean p1, p0, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;->enabled:Z

    return-void
.end method

.method public setVariantName(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;->variantName:Ljava/lang/String;

    return-void
.end method
