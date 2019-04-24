.class public Lcom/ibotta/android/features/TestConfig;
.super Ljava/lang/Object;
.source "TestConfig.java"


# instance fields
.field private final controlVariantClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final testName:Ljava/lang/String;

.field private final variantSelector:Lcom/ibotta/android/features/selector/VariantSelector;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/features/selector/VariantSelector;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/features/TestConfig;->testName:Ljava/lang/String;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/features/TestConfig;->variantSelector:Lcom/ibotta/android/features/selector/VariantSelector;

    .line 24
    iput-object p3, p0, Lcom/ibotta/android/features/TestConfig;->controlVariantClass:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public getControlVariantClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/features/TestConfig;->controlVariantClass:Ljava/lang/Class;

    return-object v0
.end method

.method public getTestName()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/features/TestConfig;->testName:Ljava/lang/String;

    return-object v0
.end method

.method public getVariantSelector()Lcom/ibotta/android/features/selector/VariantSelector;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/features/TestConfig;->variantSelector:Lcom/ibotta/android/features/selector/VariantSelector;

    return-object v0
.end method
