.class Lo/ekh$4;
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
.field final synthetic b:Ljava/util/Map;

.field final synthetic d:Lo/ekh;


# direct methods
.method constructor <init>(Lo/ekh;Ljava/util/Map;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lo/ekh$4;->d:Lo/ekh;

    iput-object p2, p0, Lo/ekh$4;->b:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 85
    iget-object v0, p0, Lo/ekh$4;->d:Lo/ekh;

    iget-object v1, p0, Lo/ekh$4;->b:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lo/ekh;->a(Ljava/util/Map;)V

    .line 86
    return-void
.end method
