.class public Lcom/rt/mobile/english/data/articles/Article;
.super Ljava/lang/Object;
.source "Article.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/data/articles/Article$Video;
    }
.end annotation


# instance fields
.field private breaking:Z

.field private id:Ljava/lang/String;

.field private image:Ljava/lang/String;

.field private section:Ljava/lang/String;

.field private sectionTitle:Ljava/lang/String;

.field private summary:Ljava/lang/String;

.field private time:Lorg/joda/time/DateTime;

.field private title:Ljava/lang/String;

.field private url:Ljava/lang/String;

.field private video:Lcom/rt/mobile/english/data/articles/Article$Video;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/rt/mobile/english/data/articles/Article;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getImage()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/rt/mobile/english/data/articles/Article;->image:Ljava/lang/String;

    return-object v0
.end method

.method public getSection()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/rt/mobile/english/data/articles/Article;->section:Ljava/lang/String;

    return-object v0
.end method

.method public getSectionTitle()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/rt/mobile/english/data/articles/Article;->sectionTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getSummary()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/rt/mobile/english/data/articles/Article;->summary:Ljava/lang/String;

    return-object v0
.end method

.method public getTime()Lorg/joda/time/DateTime;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/rt/mobile/english/data/articles/Article;->time:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/rt/mobile/english/data/articles/Article;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getURL()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/rt/mobile/english/data/articles/Article;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getVideo()Lcom/rt/mobile/english/data/articles/Article$Video;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/rt/mobile/english/data/articles/Article;->video:Lcom/rt/mobile/english/data/articles/Article$Video;

    return-object v0
.end method

.method public isBreaking()Z
    .locals 1

    .line 78
    iget-boolean v0, p0, Lcom/rt/mobile/english/data/articles/Article;->breaking:Z

    return v0
.end method
