.class public Lcom/rt/mobile/english/data/articles/Section;
.super Ljava/lang/Object;
.source "Section.java"


# instance fields
.field private id:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/rt/mobile/english/data/articles/Section;->id:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lcom/rt/mobile/english/data/articles/Section;->title:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/rt/mobile/english/data/articles/Section;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/rt/mobile/english/data/articles/Section;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/rt/mobile/english/data/articles/Section;->id:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/rt/mobile/english/data/articles/Section;->title:Ljava/lang/String;

    return-void
.end method
