.class public final Lcom/ibotta/android/features/apppicker/NewRetailerPickerVariant;
.super Ljava/lang/Object;
.source "NewRetailerPickerVariant.kt"

# interfaces
.implements Lcom/ibotta/android/features/ExperimentalVariant;
.implements Lcom/ibotta/android/features/apppicker/RetailerPickerVariant;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/ibotta/android/features/apppicker/NewRetailerPickerVariant;",
        "Lcom/ibotta/android/features/apppicker/RetailerPickerVariant;",
        "Lcom/ibotta/android/features/ExperimentalVariant;",
        "()V",
        "getPickerType",
        "Lcom/ibotta/android/features/apppicker/PickerType;",
        "ibotta-features-kotlin_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPickerType()Lcom/ibotta/android/features/apppicker/PickerType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 6
    sget-object v0, Lcom/ibotta/android/features/apppicker/PickerType;->NEW:Lcom/ibotta/android/features/apppicker/PickerType;

    return-object v0
.end method
