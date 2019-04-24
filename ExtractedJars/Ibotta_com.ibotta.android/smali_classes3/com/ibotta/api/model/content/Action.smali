.class public Lcom/ibotta/api/model/content/Action;
.super Ljava/lang/Object;
.source "Action.java"

# interfaces
.implements Lcom/ibotta/api/model/base/Actionable;


# instance fields
.field private id:I

.field private link:Ljava/lang/String;

.field private text:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/ibotta/api/model/content/Action;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput p1, p0, Lcom/ibotta/api/model/content/Action;->id:I

    return-void
.end method


# virtual methods
.method public getId()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/ibotta/api/model/content/Action;->id:I

    return v0
.end method

.method public getLink()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/model/content/Action;->link:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/api/model/content/Action;->text:Ljava/lang/String;

    return-object v0
.end method

.method public setId(I)V
    .locals 0

    .line 32
    iput p1, p0, Lcom/ibotta/api/model/content/Action;->id:I

    return-void
.end method

.method public setLink(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/api/model/content/Action;->link:Ljava/lang/String;

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/ibotta/api/model/content/Action;->text:Ljava/lang/String;

    return-void
.end method
