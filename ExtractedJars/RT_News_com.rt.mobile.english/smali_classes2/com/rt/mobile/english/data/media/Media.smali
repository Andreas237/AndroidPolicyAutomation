.class public Lcom/rt/mobile/english/data/media/Media;
.super Ljava/lang/Object;
.source "Media.java"


# instance fields
.field private id:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private url:Ljava/lang/String;


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

    .line 13
    iget-object v0, p0, Lcom/rt/mobile/english/data/media/Media;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/rt/mobile/english/data/media/Media;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/rt/mobile/english/data/media/Media;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/rt/mobile/english/data/media/Media;->url:Ljava/lang/String;

    return-object v0
.end method
