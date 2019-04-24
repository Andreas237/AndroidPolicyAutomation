.class Lo/fbd$d$5$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fbd$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fbd$d$5;->e(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fbd$d$5;


# direct methods
.method constructor <init>(Lo/fbd$d$5;)V
    .locals 0

    .line 241
    iput-object p1, p0, Lo/fbd$d$5$2;->b:Lo/fbd$d$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 244
    iget-object v0, p0, Lo/fbd$d$5$2;->b:Lo/fbd$d$5;

    iget-object v0, v0, Lo/fbd$d$5;->d:Lo/fbs;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fbs;->e(Ljava/util/Map;)V

    .line 245
    return-void
.end method
