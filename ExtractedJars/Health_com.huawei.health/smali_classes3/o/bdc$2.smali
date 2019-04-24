.class Lo/bdc$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bdc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bdc;


# direct methods
.method constructor <init>(Lo/bdc;)V
    .locals 0

    .line 233
    iput-object p1, p0, Lo/bdc$2;->b:Lo/bdc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 237
    iget-object v0, p0, Lo/bdc$2;->b:Lo/bdc;

    invoke-virtual {v0}, Lo/bdc;->e()V

    .line 238
    return-void
.end method

.method public d()V
    .locals 2

    .line 243
    invoke-static {}, Lo/bdc;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "checkClickListener performCancel"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    return-void
.end method
