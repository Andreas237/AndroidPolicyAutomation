.class public Lo/bty;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field b:Ljava/security/SecureRandom;

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private d:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 3

    .line 37
    iget-object v0, p0, Lo/bty;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 38
    iget-object v0, p0, Lo/bty;->c:Ljava/util/List;

    iget-object v1, p0, Lo/bty;->d:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 40
    :cond_0
    iget-object v0, p0, Lo/bty;->b:Ljava/security/SecureRandom;

    iget-object v1, p0, Lo/bty;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v2

    .line 41
    iget-object v0, p0, Lo/bty;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 42
    iget-object v0, p0, Lo/bty;->d:[Ljava/lang/String;

    aget-object v0, v0, v2

    return-object v0
.end method

.method public c(Landroid/content/Context;)V
    .locals 2

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bty;->c:Ljava/util/List;

    .line 27
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lo/bty;->b:Ljava/security/SecureRandom;

    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$array;->sug_rest_day_sentences:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bty;->d:[Ljava/lang/String;

    .line 29
    return-void
.end method
