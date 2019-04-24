.class Lo/ffr$4$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fft;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffr$4;->onCallBackSuccess(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ffr$4;


# direct methods
.method constructor <init>(Lo/ffr$4;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lo/ffr$4$5;->c:Lo/ffr$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/String;)V
    .locals 5

    .line 144
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullRefresh resCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const/16 v0, 0xc8

    if-ne v0, p1, :cond_0

    .line 146
    invoke-static {p2}, Lo/ffs;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 148
    iget-object v0, p0, Lo/ffr$4$5;->c:Lo/ffr$4;

    iget-object v0, v0, Lo/ffr$4;->d:Lo/ffr;

    iget-object v1, p0, Lo/ffr$4$5;->c:Lo/ffr$4;

    iget-object v1, v1, Lo/ffr$4;->b:Lo/ffv;

    invoke-static {v0, v4, v1}, Lo/ffr;->c(Lo/ffr;Ljava/util/List;Lo/ffv;)V

    .line 149
    goto :goto_0

    .line 150
    :cond_0
    iget-object v0, p0, Lo/ffr$4$5;->c:Lo/ffr$4;

    iget-object v0, v0, Lo/ffr$4;->b:Lo/ffv;

    const-string v1, ""

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Lo/ffv;->d(Ljava/lang/String;I)V

    .line 152
    :goto_0
    return-void
.end method
