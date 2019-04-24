.class public Lcom/ibotta/api/model/mvt/TestVariant;
.super Ljava/lang/Object;
.source "TestVariant.java"


# instance fields
.field private settings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private testId:I

.field private testName:Ljava/lang/String;

.field private variantName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSettings()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 81
    iget-object v0, p0, Lcom/ibotta/api/model/mvt/TestVariant;->settings:Ljava/util/List;

    return-object v0
.end method

.method public getTestId()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/ibotta/api/model/mvt/TestVariant;->testId:I

    return v0
.end method

.method public getTestName()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/api/model/mvt/TestVariant;->testName:Ljava/lang/String;

    return-object v0
.end method

.method public getVariantName()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/ibotta/api/model/mvt/TestVariant;->variantName:Ljava/lang/String;

    return-object v0
.end method

.method public setSettings(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 91
    iput-object p1, p0, Lcom/ibotta/api/model/mvt/TestVariant;->settings:Ljava/util/List;

    return-void
.end method

.method public setTestId(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/ibotta/api/model/mvt/TestVariant;->testId:I

    return-void
.end method

.method public setTestName(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/ibotta/api/model/mvt/TestVariant;->testName:Ljava/lang/String;

    return-void
.end method

.method public setVariantName(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/api/model/mvt/TestVariant;->variantName:Ljava/lang/String;

    return-void
.end method
