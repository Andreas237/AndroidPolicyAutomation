.class public abstract Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow$Builder;
.super Ljava/lang/Object;
.source "DebugVariantRow.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;
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
.method public abstract build()Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;
.end method

.method public abstract prettyVariantName(Ljava/lang/String;)Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow$Builder;
.end method

.method public abstract variantChosen(Z)Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow$Builder;
.end method
