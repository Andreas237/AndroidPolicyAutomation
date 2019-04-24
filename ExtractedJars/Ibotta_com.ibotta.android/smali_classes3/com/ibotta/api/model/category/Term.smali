.class public Lcom/ibotta/api/model/category/Term;
.super Ljava/lang/Object;
.source "Term.java"


# instance fields
.field private id:I

.field private term:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()I
    .locals 1

    .line 11
    iget v0, p0, Lcom/ibotta/api/model/category/Term;->id:I

    return v0
.end method

.method public getTerm()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/api/model/category/Term;->term:Ljava/lang/String;

    return-object v0
.end method

.method public setId(I)V
    .locals 0

    .line 15
    iput p1, p0, Lcom/ibotta/api/model/category/Term;->id:I

    return-void
.end method

.method public setTerm(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/api/model/category/Term;->term:Ljava/lang/String;

    return-void
.end method
