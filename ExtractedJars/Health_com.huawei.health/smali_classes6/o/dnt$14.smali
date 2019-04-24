.class Lo/dnt$14;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/doi;

.field final synthetic e:Lo/dnt;


# direct methods
.method constructor <init>(Lo/dnt;Lo/doi;)V
    .locals 0

    .line 480
    iput-object p1, p0, Lo/dnt$14;->e:Lo/dnt;

    iput-object p2, p0, Lo/dnt$14;->b:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 5

    .line 485
    iget-object v0, p0, Lo/dnt$14;->e:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->k(Lo/dnt;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    .line 486
    :try_start_0
    iget-object v0, p0, Lo/dnt$14;->e:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 487
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 488
    :goto_0
    iget-object v0, p0, Lo/dnt$14;->e:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->d(Lo/dnt;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lo/dnt$14$5;

    invoke-direct {v1, p0}, Lo/dnt$14$5;-><init>(Lo/dnt$14;)V

    invoke-static {v0, v2, v1}, Lo/don;->d(Landroid/content/Context;Ljava/lang/String;Lo/don$e;)V

    .line 502
    return-void
.end method
