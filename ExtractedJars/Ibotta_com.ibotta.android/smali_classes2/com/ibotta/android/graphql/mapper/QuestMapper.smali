.class public Lcom/ibotta/android/graphql/mapper/QuestMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "QuestMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/QuestFragment;",
        "Lcom/ibotta/api/model/content/QuestContent;",
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
.method protected createQuestContent()Lcom/ibotta/api/model/content/QuestContent;
    .locals 1

    .line 39
    new-instance v0, Lcom/ibotta/api/model/content/QuestContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/QuestContent;-><init>()V

    return-object v0
.end method

.method public map(Lcom/ibotta/android/graphql/fragment/QuestFragment;)Lcom/ibotta/api/model/content/QuestContent;
    .locals 2
    .param p1    # Lcom/ibotta/android/graphql/fragment/QuestFragment;
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
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/mapper/QuestMapper;->createQuestContent()Lcom/ibotta/api/model/content/QuestContent;

    move-result-object v0

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/QuestFragment;->cta()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/QuestContent;->setCta(Ljava/lang/String;)V

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/QuestFragment;->description()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/QuestContent;->setDescription(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/QuestFragment;->image_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/QuestContent;->setImageUrl(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/QuestFragment;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/QuestContent;->setName(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/QuestFragment;->state()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/QuestContent;->setState(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/QuestFragment;->step()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/QuestMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/QuestContent;->setStep(I)V

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/QuestFragment;->type()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/QuestContent;->setType(Ljava/lang/String;)V

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
    check-cast p1, Lcom/ibotta/android/graphql/fragment/QuestFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/QuestMapper;->map(Lcom/ibotta/android/graphql/fragment/QuestFragment;)Lcom/ibotta/api/model/content/QuestContent;

    move-result-object p1

    return-object p1
.end method
