.class public Lo/eju;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eju$d;,
        Lo/eju$b;,
        Lo/eju$a;,
        Lo/eju$c;
    }
.end annotation


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field private e:Lo/eju$c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/eju;->a:Ljava/util/Map;

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/eju;->c:Ljava/util/Map;

    return-void
.end method

.method static synthetic b(Lo/eju;)Ljava/util/Map;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/eju;->c:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic c(Lo/eju;)Ljava/util/Map;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/eju;->a:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public a()Lo/eju$c;
    .locals 1

    .line 76
    iget-object v0, p0, Lo/eju;->e:Lo/eju$c;

    return-object v0
.end method

.method public a(Ljava/lang/String;F)V
    .locals 2

    .line 29
    iget-object v0, p0, Lo/eju;->a:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    return-void
.end method

.method public b()Z
    .locals 1

    .line 80
    iget-object v0, p0, Lo/eju;->e:Lo/eju$c;

    if-nez v0, :cond_0

    .line 81
    const/4 v0, 0x0

    return v0

    .line 83
    :cond_0
    iget-object v0, p0, Lo/eju;->e:Lo/eju$c;

    invoke-interface {v0}, Lo/eju$c;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 84
    const/4 v0, 0x0

    return v0

    .line 86
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public d(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Ljava/lang/Object;>;"
        }
    .end annotation

    .line 64
    iget-object v0, p0, Lo/eju;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 65
    instance-of v0, v2, Ljava/util/List;

    if-nez v0, :cond_0

    .line 66
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "queryGenericObjects old not list"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 68
    :cond_0
    move-object v0, v2

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .line 48
    iget-object v0, p0, Lo/eju;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 49
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 50
    iget-object v0, p0, Lo/eju;->c:Ljava/util/Map;

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 52
    :cond_0
    iget-object v0, p0, Lo/eju;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 53
    instance-of v0, v3, Ljava/util/List;

    if-nez v0, :cond_1

    .line 54
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "addGenericObject old not list"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 56
    :cond_1
    move-object v2, v3

    check-cast v2, Ljava/util/List;

    .line 58
    :goto_0
    invoke-interface {v2, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    return-void
.end method

.method public e(Lo/eju$c;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lo/eju;->e:Lo/eju$c;

    .line 73
    return-void
.end method
