.class public Lo/bjc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private d:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lo/bjc;->d:Landroid/os/Handler;

    .line 50
    return-void
.end method

.method private static b(Ljava/lang/String;J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;J)Lo/brd<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;>;"
        }
    .end annotation

    .line 70
    new-instance v0, Lo/bjc$4;

    invoke-direct {v0, p0, p1, p2}, Lo/bjc$4;-><init>(Ljava/lang/String;J)V

    return-object v0
.end method

.method private static d(Landroid/os/Handler;)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Handler;)Lo/brc<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;>;"
        }
    .end annotation

    .line 89
    new-instance v0, Lo/bjc$3;

    invoke-direct {v0, p0}, Lo/bjc$3;-><init>(Landroid/os/Handler;)V

    return-object v0
.end method


# virtual methods
.method public d(Ljava/lang/String;J)V
    .locals 3

    .line 58
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2, p3}, Lo/bjc;->b(Ljava/lang/String;J)Lo/brd;

    move-result-object v1

    iget-object v2, p0, Lo/bjc;->d:Landroid/os/Handler;

    .line 59
    invoke-static {v2}, Lo/bjc;->d(Landroid/os/Handler;)Lo/brc;

    move-result-object v2

    .line 58
    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 60
    return-void
.end method
