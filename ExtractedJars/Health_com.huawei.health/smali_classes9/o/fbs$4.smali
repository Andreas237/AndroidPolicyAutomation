.class Lo/fbs$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fbs;->e(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/Map;

.field final synthetic c:Lo/fbs$d;

.field final synthetic d:Lo/fbs;


# direct methods
.method constructor <init>(Lo/fbs;Lo/fbs$d;Ljava/util/Map;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lo/fbs$4;->d:Lo/fbs;

    iput-object p2, p0, Lo/fbs$4;->c:Lo/fbs$d;

    iput-object p3, p0, Lo/fbs$4;->b:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 92
    iget-object v0, p0, Lo/fbs$4;->c:Lo/fbs$d;

    iget-object v1, p0, Lo/fbs$4;->b:Ljava/util/Map;

    invoke-interface {v0, v1}, Lo/fbs$d;->e(Ljava/util/Map;)V

    .line 93
    return-void
.end method
