.class Lo/fbs$5;
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
.field final synthetic c:Ljava/util/Map;

.field final synthetic e:Lo/fbs;


# direct methods
.method constructor <init>(Lo/fbs;Ljava/util/Map;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lo/fbs$5;->e:Lo/fbs;

    iput-object p2, p0, Lo/fbs$5;->c:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 82
    iget-object v0, p0, Lo/fbs$5;->e:Lo/fbs;

    iget-object v1, p0, Lo/fbs$5;->c:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lo/fbs;->b(Ljava/util/Map;)V

    .line 83
    return-void
.end method
