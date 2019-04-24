.class final Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;
.super Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
.source "AutoValue_FeatureFlag.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private controlDescription:Ljava/lang/String;

.field private controlFriendlyName:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private employeeVariantName:Ljava/lang/String;

.field private friendlyName:Ljava/lang/String;

.field private minVersion:Ljava/lang/String;

.field private mvtTestName:Ljava/lang/String;

.field private variantFeatureInfoMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/featureflag/VariantInfo;",
            ">;"
        }
    .end annotation
.end field

.field private winnerVariantName:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 175
    invoke-direct {p0}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/state/app/featureflag/FeatureFlag;
    .locals 12

    .line 224
    new-instance v11, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;

    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->friendlyName:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->description:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->controlFriendlyName:Ljava/lang/String;

    iget-object v4, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->controlDescription:Ljava/lang/String;

    iget-object v5, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->mvtTestName:Ljava/lang/String;

    iget-object v6, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->minVersion:Ljava/lang/String;

    iget-object v7, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->employeeVariantName:Ljava/lang/String;

    iget-object v8, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->winnerVariantName:Ljava/lang/String;

    iget-object v9, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->variantFeatureInfoMap:Ljava/util/Map;

    const/4 v10, 0x0

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$1;)V

    return-object v11
.end method

.method public controlDescription(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 194
    iput-object p1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->controlDescription:Ljava/lang/String;

    return-object p0
.end method

.method public controlFriendlyName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 189
    iput-object p1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->controlFriendlyName:Ljava/lang/String;

    return-object p0
.end method

.method public description(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 184
    iput-object p1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->description:Ljava/lang/String;

    return-object p0
.end method

.method public employeeVariantName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 209
    iput-object p1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->employeeVariantName:Ljava/lang/String;

    return-object p0
.end method

.method public friendlyName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 179
    iput-object p1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->friendlyName:Ljava/lang/String;

    return-object p0
.end method

.method public minVersion(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 204
    iput-object p1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->minVersion:Ljava/lang/String;

    return-object p0
.end method

.method public mvtTestName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 199
    iput-object p1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->mvtTestName:Ljava/lang/String;

    return-object p0
.end method

.method public variantFeatureInfoMap(Ljava/util/Map;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .locals 0
    .param p1    # Ljava/util/Map;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/featureflag/VariantInfo;",
            ">;)",
            "Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;"
        }
    .end annotation

    .line 219
    iput-object p1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->variantFeatureInfoMap:Ljava/util/Map;

    return-object p0
.end method

.method public winnerVariantName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 214
    iput-object p1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->winnerVariantName:Ljava/lang/String;

    return-object p0
.end method
