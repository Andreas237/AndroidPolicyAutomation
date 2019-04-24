.class Lo/cca$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ccf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cca;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cca;


# direct methods
.method constructor <init>(Lo/cca;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lo/cca$4;->b:Lo/cca;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 153
    iget-object v0, p0, Lo/cca$4;->b:Lo/cca;

    invoke-static {v0}, Lo/cca;->a(Lo/cca;)Lo/cbq;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbq;->b()Z

    move-result v0

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 4

    .line 144
    iget-object v0, p0, Lo/cca$4;->b:Lo/cca;

    invoke-static {v0}, Lo/cca;->a(Lo/cca;)Lo/cbq;

    move-result-object v0

    if-nez v0, :cond_0

    .line 145
    const-string v0, "Track_StrategyManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurState mArMotionDetector null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    const-string v0, "unkwon"

    return-object v0

    .line 148
    :cond_0
    iget-object v0, p0, Lo/cca$4;->b:Lo/cca;

    invoke-static {v0}, Lo/cca;->a(Lo/cca;)Lo/cbq;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbq;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(I)V
    .locals 1

    .line 139
    iget-object v0, p0, Lo/cca$4;->b:Lo/cca;

    invoke-static {v0, p1}, Lo/cca;->a(Lo/cca;I)V

    .line 140
    return-void
.end method
