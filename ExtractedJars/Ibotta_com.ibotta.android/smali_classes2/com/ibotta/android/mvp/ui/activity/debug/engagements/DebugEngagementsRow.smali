.class public Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;
.super Ljava/lang/Object;
.source "DebugEngagementsRow.java"


# instance fields
.field private count:I

.field private name:Ljava/lang/String;

.field private offerId:I

.field private type:Lcom/ibotta/api/model/TaskModel$Type;


# direct methods
.method public constructor <init>(ILcom/ibotta/api/model/TaskModel$Type;Ljava/lang/String;I)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->offerId:I

    .line 17
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->type:Lcom/ibotta/api/model/TaskModel$Type;

    .line 18
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->name:Ljava/lang/String;

    .line 19
    iput p4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->count:I

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->count:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOfferId()I
    .locals 1

    .line 23
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->offerId:I

    return v0
.end method

.method public getType()Lcom/ibotta/api/model/TaskModel$Type;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->type:Lcom/ibotta/api/model/TaskModel$Type;

    return-object v0
.end method

.method public setCount(I)V
    .locals 0

    .line 47
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->count:I

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->name:Ljava/lang/String;

    return-void
.end method

.method public setOfferId(I)V
    .locals 0

    .line 27
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->offerId:I

    return-void
.end method

.method public setType(Lcom/ibotta/api/model/TaskModel$Type;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->type:Lcom/ibotta/api/model/TaskModel$Type;

    return-void
.end method
