.class public Lcom/ibotta/api/model/content/QualificationContent;
.super Ljava/lang/Object;
.source "QualificationContent.java"

# interfaces
.implements Lcom/ibotta/api/model/QualificationModel;


# instance fields
.field private completed:Z

.field private id:Ljava/lang/String;

.field private progressDescription:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCompleted()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/QualificationContent;->completed:Z

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/ibotta/api/model/content/QualificationContent;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getProgressDescription()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/api/model/content/QualificationContent;->progressDescription:Ljava/lang/String;

    return-object v0
.end method

.method public setCompleted(Z)V
    .locals 0

    .line 29
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/QualificationContent;->completed:Z

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/ibotta/api/model/content/QualificationContent;->id:Ljava/lang/String;

    return-void
.end method

.method public setProgressDescription(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/api/model/content/QualificationContent;->progressDescription:Ljava/lang/String;

    return-void
.end method
