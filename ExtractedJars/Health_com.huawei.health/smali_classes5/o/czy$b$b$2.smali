.class Lo/czy$b$b$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/czy$b$b;-><init>(Lo/czy$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/czy$a;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/czy$b;

.field final synthetic c:Ljava/util/Map;

.field final synthetic d:Lo/czy$b$b;


# direct methods
.method constructor <init>(Lo/czy$b$b;Lo/czy$b;Ljava/util/Map;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lo/czy$b$b$2;->d:Lo/czy$b$b;

    iput-object p2, p0, Lo/czy$b$b$2;->a:Lo/czy$b;

    iput-object p3, p0, Lo/czy$b$b$2;->c:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/czy$a;Lo/czy$a;)I
    .locals 4

    .line 259
    iget-object v0, p0, Lo/czy$b$b$2;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/czy$b$b$2;->c:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 260
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "sort records not in markered List,logical error!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 262
    :cond_1
    iget-object v0, p0, Lo/czy$b$b$2;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/czy$b$b$d;

    .line 263
    iget-object v0, p0, Lo/czy$b$b$2;->c:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/czy$b$b$d;

    .line 264
    invoke-virtual {v2}, Lo/czy$b$b$d;->d()F

    move-result v0

    invoke-virtual {v3}, Lo/czy$b$b$d;->d()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 256
    move-object v0, p1

    check-cast v0, Lo/czy$a;

    move-object v1, p2

    check-cast v1, Lo/czy$a;

    invoke-virtual {p0, v0, v1}, Lo/czy$b$b$2;->a(Lo/czy$a;Lo/czy$a;)I

    move-result v0

    return v0
.end method
