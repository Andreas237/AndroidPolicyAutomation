.class Lo/ekh$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ekh;->e(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ekh$e;

.field final synthetic c:Ljava/util/Map;

.field final synthetic d:Lo/ekh;


# direct methods
.method constructor <init>(Lo/ekh;Lo/ekh$e;Ljava/util/Map;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lo/ekh$3;->d:Lo/ekh;

    iput-object p2, p0, Lo/ekh$3;->a:Lo/ekh$e;

    iput-object p3, p0, Lo/ekh$3;->c:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 95
    iget-object v0, p0, Lo/ekh$3;->a:Lo/ekh$e;

    iget-object v1, p0, Lo/ekh$3;->c:Ljava/util/Map;

    invoke-interface {v0, v1}, Lo/ekh$e;->a(Ljava/util/Map;)V

    .line 96
    return-void
.end method
