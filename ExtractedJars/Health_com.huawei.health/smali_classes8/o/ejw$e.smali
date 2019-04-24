.class Lo/ejw$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ejw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/eii;Lo/ejw$a;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/ejw$e;->e:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lo/ejw$3;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lo/ejw$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/eii;)Lo/eic;
    .locals 2

    .line 96
    invoke-virtual {p0, p1}, Lo/ejw$e;->c(Lo/eii;)Lo/ejw$a;

    move-result-object v1

    .line 97
    if-eqz p1, :cond_0

    if-nez v1, :cond_1

    .line 98
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 100
    :cond_1
    iget-object v0, v1, Lo/ejw$a;->d:Lo/eic;

    return-object v0
.end method

.method public b(Lo/eii;)Lo/ejk;
    .locals 2

    .line 69
    invoke-virtual {p0, p1}, Lo/ejw$e;->c(Lo/eii;)Lo/ejw$a;

    move-result-object v1

    .line 70
    if-nez p1, :cond_0

    .line 71
    const/4 v0, 0x0

    return-object v0

    .line 73
    :cond_0
    iget-object v0, v1, Lo/ejw$a;->c:Lo/ejk;

    return-object v0
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Lo/eii;>;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lo/ejw$e;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/eii;)Lo/ejw$a;
    .locals 3

    .line 57
    iget-object v0, p0, Lo/ejw$e;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ejw$a;

    .line 58
    if-nez v2, :cond_0

    .line 59
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "dataSetProp null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 61
    :cond_0
    return-object v2
.end method

.method public d(Lo/eii;)Lo/ehe$a;
    .locals 2

    .line 88
    invoke-virtual {p0, p1}, Lo/ejw$e;->c(Lo/eii;)Lo/ejw$a;

    move-result-object v1

    .line 89
    if-nez p1, :cond_0

    .line 90
    const/4 v0, 0x0

    return-object v0

    .line 92
    :cond_0
    iget-object v0, v1, Lo/ejw$a;->a:Lo/ehe$a;

    return-object v0
.end method

.method public d(Lo/eii;Lo/ejw$a;)V
    .locals 1

    .line 53
    iget-object v0, p0, Lo/ejw$e;->e:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    return-void
.end method

.method public e(Lo/eii;)V
    .locals 1

    .line 65
    iget-object v0, p0, Lo/ejw$e;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    return-void
.end method
