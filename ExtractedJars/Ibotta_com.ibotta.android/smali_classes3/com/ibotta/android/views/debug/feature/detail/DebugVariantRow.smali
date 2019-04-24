.class public abstract Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;
.super Ljava/lang/Object;
.source "DebugVariantRow.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow$Builder;
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 7
    invoke-static {}, Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;->builder()Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow$Builder;

    move-result-object v0

    const-string v1, "control"

    .line 8
    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow$Builder;->prettyVariantName(Ljava/lang/String;)Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow$Builder;->variantChosen(Z)Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow$Builder;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow$Builder;->build()Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;->EMPTY:Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow$Builder;
    .locals 1

    .line 16
    new-instance v0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getPrettyVariantName()Ljava/lang/String;
.end method

.method public abstract isVariantChosen()Z
.end method
