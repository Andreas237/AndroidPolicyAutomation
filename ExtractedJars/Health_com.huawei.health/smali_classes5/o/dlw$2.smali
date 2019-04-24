.class Lo/dlw$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlw;->c(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic c:Lo/dlw;


# direct methods
.method constructor <init>(Lo/dlw;Ljava/util/Map;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lo/dlw$2;->c:Lo/dlw;

    iput-object p2, p0, Lo/dlw$2;->a:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 123
    iget-object v0, p0, Lo/dlw$2;->a:Ljava/util/Map;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    .line 124
    iget-object v0, p0, Lo/dlw$2;->a:Ljava/util/Map;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 125
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    const-string v0, "SportStep_1"

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    const-string v0, "SportStep_1"

    .line 126
    invoke-interface {v3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 127
    :cond_1
    iget-object v0, p0, Lo/dlw$2;->c:Lo/dlw;

    invoke-virtual {v0}, Lo/dlw;->c()V

    .line 128
    iget-object v0, p0, Lo/dlw$2;->c:Lo/dlw;

    invoke-virtual {v0}, Lo/dlw;->b()V

    .line 129
    iget-object v0, p0, Lo/dlw$2;->c:Lo/dlw;

    invoke-virtual {v0}, Lo/dlw;->a()V

    .line 131
    :cond_2
    return-void
.end method
