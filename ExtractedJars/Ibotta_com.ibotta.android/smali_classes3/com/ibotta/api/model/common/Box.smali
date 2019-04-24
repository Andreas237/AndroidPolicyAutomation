.class public Lcom/ibotta/api/model/common/Box;
.super Ljava/lang/Object;
.source "Box.java"


# instance fields
.field private ne:Lcom/ibotta/api/model/common/Coords;

.field private sw:Lcom/ibotta/api/model/common/Coords;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getNe()Lcom/ibotta/api/model/common/Coords;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/api/model/common/Box;->ne:Lcom/ibotta/api/model/common/Coords;

    return-object v0
.end method

.method public getSw()Lcom/ibotta/api/model/common/Coords;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/ibotta/api/model/common/Box;->sw:Lcom/ibotta/api/model/common/Coords;

    return-object v0
.end method

.method public setNe(Lcom/ibotta/api/model/common/Coords;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/api/model/common/Box;->ne:Lcom/ibotta/api/model/common/Coords;

    return-void
.end method

.method public setSw(Lcom/ibotta/api/model/common/Coords;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/ibotta/api/model/common/Box;->sw:Lcom/ibotta/api/model/common/Coords;

    return-void
.end method
