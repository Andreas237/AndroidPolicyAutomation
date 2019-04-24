.class Lo/doi$1;
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
.field final synthetic a:Lo/doi;

.field final synthetic e:Ljava/util/Map;


# direct methods
.method constructor <init>(Lo/doi;Ljava/util/Map;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lo/doi$1;->a:Lo/doi;

    iput-object p2, p0, Lo/doi$1;->e:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 86
    iget-object v0, p0, Lo/doi$1;->a:Lo/doi;

    iget-object v1, p0, Lo/doi$1;->e:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lo/doi;->a(Ljava/util/Map;)V

    .line 87
    return-void
.end method
