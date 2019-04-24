.class public Lo/ash;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/List;Lcom/huawei/health/sns/logic/contacts/SnsFriend;)Lo/aso;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/asl;>;Lcom/huawei/health/sns/logic/contacts/SnsFriend;)Lo/aso;"
        }
    .end annotation

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/asl;

    .line 30
    invoke-virtual {v4}, Lo/asl;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/aso;

    .line 32
    invoke-static {p2, v6}, Lo/asf;->b(Lcom/huawei/health/sns/logic/contacts/SnsFriend;Lo/aso;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 34
    move-object v2, v6

    .line 35
    goto :goto_2

    .line 37
    :cond_0
    goto :goto_1

    .line 38
    :cond_1
    :goto_2
    if-eqz v2, :cond_2

    .line 40
    invoke-virtual {v4}, Lo/asl;->b()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/aso;->d(J)V

    .line 41
    goto :goto_3

    .line 43
    :cond_2
    goto :goto_0

    .line 44
    :cond_3
    :goto_3
    return-object v2
.end method
