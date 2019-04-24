.class final Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo$Builder;
.super Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;
.source "AutoValue_VariantInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private description:Ljava/lang/String;

.field private friendlyName:Ljava/lang/String;

.field private mvtVariantName:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/state/app/featureflag/VariantInfo;
    .locals 5

    .line 103
    new-instance v0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;

    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo$Builder;->friendlyName:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo$Builder;->description:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo$Builder;->mvtVariantName:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo$1;)V

    return-object v0
.end method

.method public description(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 93
    iput-object p1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo$Builder;->description:Ljava/lang/String;

    return-object p0
.end method

.method public friendlyName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 88
    iput-object p1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo$Builder;->friendlyName:Ljava/lang/String;

    return-object p0
.end method

.method public mvtVariantName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 98
    iput-object p1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo$Builder;->mvtVariantName:Ljava/lang/String;

    return-object p0
.end method
