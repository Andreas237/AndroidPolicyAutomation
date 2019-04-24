.class Lo/atb$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atb;->e(IJZ)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic c:Lo/atb;

.field final synthetic d:Z

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/atb;JIZ)V
    .locals 0

    .line 212
    iput-object p1, p0, Lo/atb$3;->c:Lo/atb;

    iput-wide p2, p0, Lo/atb$3;->a:J

    iput p4, p0, Lo/atb$3;->e:I

    iput-boolean p5, p0, Lo/atb$3;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 216
    iget-object v0, p0, Lo/atb$3;->c:Lo/atb;

    iget-wide v1, p0, Lo/atb$3;->a:J

    iget v3, p0, Lo/atb$3;->e:I

    iget-boolean v4, p0, Lo/atb$3;->d:Z

    invoke-static {v0, v1, v2, v3, v4}, Lo/atb;->b(Lo/atb;JIZ)Lcom/huawei/health/sns/model/group/Group;

    .line 217
    return-void
.end method

.method public e(II)V
    .locals 0

    .line 223
    return-void
.end method
