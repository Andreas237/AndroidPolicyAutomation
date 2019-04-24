.class public Lo/ate;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ate;->e:Landroid/os/Handler;

    .line 89
    iput-object p1, p0, Lo/ate;->e:Landroid/os/Handler;

    .line 90
    return-void
.end method

.method static synthetic b(Lo/ate;)Landroid/os/Handler;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/ate;->e:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public b(ILcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 155
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/ate$2;

    invoke-direct {v1, p0, p2, p1}, Lo/ate$2;-><init>(Lo/ate;Lcom/huawei/health/sns/model/group/Group;I)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 175
    return-void
.end method

.method public d(ILcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 100
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/ate$1;

    invoke-direct {v1, p0, p2, p1}, Lo/ate$1;-><init>(Lo/ate;Lcom/huawei/health/sns/model/group/Group;I)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 145
    return-void
.end method
