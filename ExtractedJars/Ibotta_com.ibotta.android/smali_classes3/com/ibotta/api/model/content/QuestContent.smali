.class public Lcom/ibotta/api/model/content/QuestContent;
.super Ljava/lang/Object;
.source "QuestContent.java"

# interfaces
.implements Lcom/ibotta/api/model/QuestModel;


# instance fields
.field private cta:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private imageUrl:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private transient questStateEnum:Lcom/ibotta/api/model/QuestModel$State;

.field private transient questTypeEnum:Lcom/ibotta/api/model/QuestModel$Type;

.field private state:Ljava/lang/String;

.field private step:I

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCta()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/api/model/content/QuestContent;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/api/model/content/QuestContent;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/api/model/content/QuestContent;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/api/model/content/QuestContent;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestStateEnum()Lcom/ibotta/api/model/QuestModel$State;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/api/model/content/QuestContent;->questStateEnum:Lcom/ibotta/api/model/QuestModel$State;

    if-nez v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/ibotta/api/model/content/QuestContent;->state:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/QuestModel$State;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/QuestModel$State;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/content/QuestContent;->questStateEnum:Lcom/ibotta/api/model/QuestModel$State;

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/content/QuestContent;->questStateEnum:Lcom/ibotta/api/model/QuestModel$State;

    return-object v0
.end method

.method public getQuestTypeEnum()Lcom/ibotta/api/model/QuestModel$Type;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/ibotta/api/model/content/QuestContent;->questTypeEnum:Lcom/ibotta/api/model/QuestModel$Type;

    if-nez v0, :cond_0

    .line 95
    iget-object v0, p0, Lcom/ibotta/api/model/content/QuestContent;->type:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/QuestModel$Type;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/QuestModel$Type;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/content/QuestContent;->questTypeEnum:Lcom/ibotta/api/model/QuestModel$Type;

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/content/QuestContent;->questTypeEnum:Lcom/ibotta/api/model/QuestModel$Type;

    return-object v0
.end method

.method public getState()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/ibotta/api/model/content/QuestContent;->state:Ljava/lang/String;

    return-object v0
.end method

.method public getStep()I
    .locals 1

    .line 59
    iget v0, p0, Lcom/ibotta/api/model/content/QuestContent;->step:I

    return v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/ibotta/api/model/content/QuestContent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public setCta(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/api/model/content/QuestContent;->cta:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/api/model/content/QuestContent;->description:Ljava/lang/String;

    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/ibotta/api/model/content/QuestContent;->imageUrl:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/api/model/content/QuestContent;->name:Ljava/lang/String;

    return-void
.end method

.method public setQuestTypeEnum(Lcom/ibotta/api/model/QuestModel$Type;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/ibotta/api/model/content/QuestContent;->questTypeEnum:Lcom/ibotta/api/model/QuestModel$Type;

    return-void
.end method

.method public setState(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/ibotta/api/model/content/QuestContent;->state:Ljava/lang/String;

    return-void
.end method

.method public setStep(I)V
    .locals 0

    .line 63
    iput p1, p0, Lcom/ibotta/api/model/content/QuestContent;->step:I

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/ibotta/api/model/content/QuestContent;->type:Ljava/lang/String;

    return-void
.end method
