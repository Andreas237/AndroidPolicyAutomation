.class Lo/arn$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arn;->a(JJI)V
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
.field final synthetic a:J

.field final synthetic b:I

.field final synthetic d:Lo/arn;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/arn;JJI)V
    .locals 0

    .line 609
    iput-object p1, p0, Lo/arn$2;->d:Lo/arn;

    iput-wide p2, p0, Lo/arn$2;->e:J

    iput-wide p4, p0, Lo/arn$2;->a:J

    iput p6, p0, Lo/arn$2;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 609
    invoke-virtual {p0, p1}, Lo/arn$2;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 613
    iget-wide v0, p0, Lo/arn$2;->e:J

    iget-wide v2, p0, Lo/arn$2;->a:J

    iget v4, p0, Lo/arn$2;->b:I

    invoke-static {v0, v1, v2, v3, v4}, Lo/aro;->c(JJI)Lcom/huawei/health/sns/model/user/User;

    move-result-object v5

    .line 614
    if-eqz v5, :cond_0

    .line 616
    iget-object v0, p0, Lo/arn$2;->d:Lo/arn;

    iget-wide v1, p0, Lo/arn$2;->e:J

    invoke-static {v0, v1, v2, v5}, Lo/arn;->e(Lo/arn;JLcom/huawei/health/sns/model/user/User;)V

    .line 618
    :cond_0
    invoke-static {}, Lo/aro;->d()V

    .line 619
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
