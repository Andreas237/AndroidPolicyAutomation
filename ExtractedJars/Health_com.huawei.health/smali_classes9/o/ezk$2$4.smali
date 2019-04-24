.class Lo/ezk$2$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ezk$b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ezk$2;->a(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ezk$2;

.field final synthetic e:Ljava/util/Map;


# direct methods
.method constructor <init>(Lo/ezk$2;Ljava/util/Map;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lo/ezk$2$4;->b:Lo/ezk$2;

    iput-object p2, p0, Lo/ezk$2$4;->e:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(F)V
    .locals 3

    .line 103
    iget-object v0, p0, Lo/ezk$2$4;->e:Ljava/util/Map;

    const-string v1, "value"

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    iget-object v0, p0, Lo/ezk$2$4;->b:Lo/ezk$2;

    iget-object v0, v0, Lo/ezk$2;->d:Lo/ekh;

    iget-object v1, p0, Lo/ezk$2$4;->e:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lo/ekh;->e(Ljava/util/Map;)V

    .line 105
    return-void
.end method
