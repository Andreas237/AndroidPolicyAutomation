.class public Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "BonusQualificationMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;",
        "Lcom/ibotta/api/model/content/QualificationContent;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-void
.end method


# virtual methods
.method protected createQualificationContent()Lcom/ibotta/api/model/content/QualificationContent;
    .locals 1

    .line 34
    new-instance v0, Lcom/ibotta/api/model/content/QualificationContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/QualificationContent;-><init>()V

    return-object v0
.end method

.method public map(Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;)Lcom/ibotta/api/model/content/QualificationContent;
    .locals 2
    .param p1    # Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;->createQualificationContent()Lcom/ibotta/api/model/content/QualificationContent;

    move-result-object v0

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/QualificationContent;->setId(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->completed()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/QualificationContent;->setCompleted(Z)V

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->progress_description()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/QualificationContent;->setProgressDescription(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic map(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 13
    check-cast p1, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;->map(Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;)Lcom/ibotta/api/model/content/QualificationContent;

    move-result-object p1

    return-object p1
.end method
