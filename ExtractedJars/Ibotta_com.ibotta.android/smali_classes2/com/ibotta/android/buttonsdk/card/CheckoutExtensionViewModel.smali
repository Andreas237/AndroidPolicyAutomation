.class public abstract Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;
.super Ljava/lang/Object;
.source "CheckoutExtensionViewModel.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;
    .locals 7
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 24
    new-instance v6, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method


# virtual methods
.method public abstract getCashBackString()Ljava/lang/String;
.end method

.method public abstract getPendingPeriod()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRetailerName()Ljava/lang/String;
.end method

.method public abstract getSpecialConditions()Ljava/lang/String;
.end method

.method public abstract getSubtitle()Ljava/lang/String;
.end method
