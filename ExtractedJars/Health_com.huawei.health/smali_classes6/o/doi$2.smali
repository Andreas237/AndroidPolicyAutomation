.class Lo/doi$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/doi;->e(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic c:Lo/doi;

.field final synthetic e:Lo/doi$a;


# direct methods
.method constructor <init>(Lo/doi;Lo/doi$a;Ljava/util/Map;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lo/doi$2;->c:Lo/doi;

    iput-object p2, p0, Lo/doi$2;->e:Lo/doi$a;

    iput-object p3, p0, Lo/doi$2;->a:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 96
    iget-object v0, p0, Lo/doi$2;->e:Lo/doi$a;

    iget-object v1, p0, Lo/doi$2;->a:Ljava/util/Map;

    invoke-interface {v0, v1}, Lo/doi$a;->e(Ljava/util/Map;)V

    .line 97
    return-void
.end method
