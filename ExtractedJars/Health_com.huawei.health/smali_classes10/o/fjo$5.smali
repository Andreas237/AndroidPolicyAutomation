.class Lo/fjo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fjo;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/fjo;


# direct methods
.method constructor <init>(Lo/fjo;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lo/fjo$5;->d:Lo/fjo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 117
    if-nez p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 118
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===requestGoogleFitPonitDatas objData= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    iget-object v0, p0, Lo/fjo$5;->d:Lo/fjo;

    move-object v1, p2

    check-cast v1, Ljava/util/List;

    iput-object v1, v0, Lo/fjo;->d:Ljava/util/List;

    .line 121
    :cond_0
    iget-object v0, p0, Lo/fjo$5;->d:Lo/fjo;

    invoke-static {v0}, Lo/fjo;->b(Lo/fjo;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 122
    return-void
.end method
