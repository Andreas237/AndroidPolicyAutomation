.class Lo/ffr$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffr;->a(Lo/ffv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ffv;

.field final synthetic d:Lo/ffr;


# direct methods
.method constructor <init>(Lo/ffr;Lo/ffv;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lo/ffr$4;->d:Lo/ffr;

    iput-object p2, p0, Lo/ffr$4;->b:Lo/ffv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 158
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCallBackFail i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 4

    .line 140
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GET KEY SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    iget-object v0, p0, Lo/ffr$4;->d:Lo/ffr;

    const/4 v1, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/ffr;->d(Lo/ffr;ZZZ)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lo/ffr$4$5;

    invoke-direct {v1, p0}, Lo/ffr$4$5;-><init>(Lo/ffr$4;)V

    invoke-static {p1, v0, v1}, Lo/fga;->a(Ljava/lang/String;Ljava/lang/String;Lo/fft;)V

    .line 154
    return-void
.end method
