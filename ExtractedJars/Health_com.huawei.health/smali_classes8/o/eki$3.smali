.class Lo/eki$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eki;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eki$b;

.field final synthetic d:Lo/eki;


# direct methods
.method constructor <init>(Lo/eki;Lo/eki$b;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lo/eki$3;->d:Lo/eki;

    iput-object p2, p0, Lo/eki$3;->c:Lo/eki$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 81
    iget-object v0, p0, Lo/eki$3;->c:Lo/eki$b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/eki$b;->c(Ljava/util/Map;)V

    .line 82
    return-void
.end method
