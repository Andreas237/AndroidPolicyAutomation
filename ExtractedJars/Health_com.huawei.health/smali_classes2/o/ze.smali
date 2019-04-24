.class public Lo/ze;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Lo/zf;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 81
    iget-object v0, p0, Lo/ze;->c:Lo/zf;

    invoke-virtual {v0, p1}, Lo/zf;->d(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Lo/zd;
    .locals 1

    .line 98
    iget-object v0, p0, Lo/ze;->c:Lo/zf;

    invoke-virtual {v0, p1, p2}, Lo/zf;->d(Ljava/lang/String;Ljava/lang/String;)Lo/zd;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;)Ljava/lang/Long;
    .locals 1

    .line 93
    iget-object v0, p0, Lo/ze;->c:Lo/zf;

    invoke-virtual {v0, p1}, Lo/zf;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 3

    .line 44
    invoke-static {}, Lo/zi;->c()Lo/zf;

    move-result-object v2

    .line 46
    iput-object v2, p0, Lo/ze;->c:Lo/zf;

    .line 48
    iget-object v0, p0, Lo/ze;->c:Lo/zf;

    if-eqz v0, :cond_0

    .line 50
    const-string v0, "ResourceMgr loadData configMgr is not null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 51
    const/4 v0, 0x1

    return v0

    .line 55
    :cond_0
    const-string v0, "ResourceMgr loadData configMgr is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 56
    const/4 v0, 0x0

    return v0
.end method
