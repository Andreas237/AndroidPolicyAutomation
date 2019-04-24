.class Lo/ale$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->af()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;)V
    .locals 0

    .line 1331
    iput-object p1, p0, Lo/ale$17;->b:Lo/ale;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1334
    new-instance v2, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoReq;

    invoke-direct {v2}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoReq;-><init>()V

    .line 1335
    iget-object v0, p0, Lo/ale$17;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lo/ale$17$5;

    invoke-direct {v1, p0}, Lo/ale$17$5;-><init>(Lo/ale$17;)V

    invoke-virtual {v0, v2, v1}, Lo/czg;->e(Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoReq;Lo/cyx;)V

    .line 1356
    return-void
.end method
