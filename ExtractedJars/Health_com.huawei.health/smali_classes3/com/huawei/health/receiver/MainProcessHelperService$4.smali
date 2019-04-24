.class Lcom/huawei/health/receiver/MainProcessHelperService$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dcx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/receiver/MainProcessHelperService;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/receiver/MainProcessHelperService;


# direct methods
.method constructor <init>(Lcom/huawei/health/receiver/MainProcessHelperService;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lcom/huawei/health/receiver/MainProcessHelperService$4;->d:Lcom/huawei/health/receiver/MainProcessHelperService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProcessed(Lo/ddb;)V
    .locals 4

    .line 150
    const-string v0, "MainProcessHelperService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartCommand ACTION_START_MAIN_PROCESS_FOR_ST_DB st reseult = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/ddb;->e()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    return-void
.end method
