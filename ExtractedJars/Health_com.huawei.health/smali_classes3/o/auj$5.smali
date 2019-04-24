.class Lo/auj$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/auj;->e(Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lo/auj;

.field final synthetic d:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

.field final synthetic e:Lo/aud;


# direct methods
.method constructor <init>(Lo/auj;Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V
    .locals 0

    .line 264
    iput-object p1, p0, Lo/auj$5;->b:Lo/auj;

    iput-object p2, p0, Lo/auj$5;->e:Lo/aud;

    iput-object p3, p0, Lo/auj$5;->d:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    iput-boolean p4, p0, Lo/auj$5;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 268
    iget-object v0, p0, Lo/auj$5;->b:Lo/auj;

    iget-object v1, p0, Lo/auj$5;->e:Lo/aud;

    iget-object v2, p0, Lo/auj$5;->d:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    iget-boolean v3, p0, Lo/auj$5;->a:Z

    invoke-static {v0, v1, v2, v3}, Lo/auj;->a(Lo/auj;Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V

    .line 269
    return-void
.end method
