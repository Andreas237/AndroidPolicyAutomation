.class Lcom/huawei/health/manager/DaemonService$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/manager/DaemonService;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/manager/DaemonService;


# direct methods
.method constructor <init>(Lcom/huawei/health/manager/DaemonService;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/huawei/health/manager/DaemonService$5;->c:Lcom/huawei/health/manager/DaemonService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .line 148
    invoke-static {}, Lo/dhn;->d()V

    .line 149
    return-void
.end method
