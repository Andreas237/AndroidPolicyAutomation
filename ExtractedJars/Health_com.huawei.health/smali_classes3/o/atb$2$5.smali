.class Lo/atb$2$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atb$2;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/atb$2;


# direct methods
.method constructor <init>(Lo/atb$2;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lo/atb$2$5;->c:Lo/atb$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 244
    invoke-virtual {p0, p1}, Lo/atb$2$5;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 248
    iget-object v0, p0, Lo/atb$2$5;->c:Lo/atb$2;

    iget-object v0, v0, Lo/atb$2;->b:Lo/atb;

    iget-object v1, p0, Lo/atb$2$5;->c:Lo/atb$2;

    iget-wide v1, v1, Lo/atb$2;->a:J

    iget-object v3, p0, Lo/atb$2$5;->c:Lo/atb$2;

    iget v3, v3, Lo/atb$2;->e:I

    iget-object v4, p0, Lo/atb$2$5;->c:Lo/atb$2;

    iget-boolean v4, v4, Lo/atb$2;->d:Z

    invoke-static {v0, v1, v2, v3, v4}, Lo/atb;->b(Lo/atb;JIZ)Lcom/huawei/health/sns/model/group/Group;

    .line 249
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
