.class public Lo/avs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lo/avs;->b:Landroid/os/Handler;

    .line 50
    return-void
.end method

.method private static b(Landroid/os/Handler;)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Handler;)Lo/brc<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;>;"
        }
    .end annotation

    .line 87
    new-instance v0, Lo/avs$4;

    invoke-direct {v0, p0}, Lo/avs$4;-><init>(Landroid/os/Handler;)V

    return-object v0
.end method

.method private static d(Ljava/lang/String;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Lo/brd<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;>;"
        }
    .end annotation

    .line 70
    new-instance v0, Lo/avs$1;

    invoke-direct {v0, p0}, Lo/avs$1;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public e(Ljava/lang/String;)V
    .locals 3

    .line 58
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1}, Lo/avs;->d(Ljava/lang/String;)Lo/brd;

    move-result-object v1

    iget-object v2, p0, Lo/avs;->b:Landroid/os/Handler;

    .line 59
    invoke-static {v2}, Lo/avs;->b(Landroid/os/Handler;)Lo/brc;

    move-result-object v2

    .line 58
    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 60
    return-void
.end method
