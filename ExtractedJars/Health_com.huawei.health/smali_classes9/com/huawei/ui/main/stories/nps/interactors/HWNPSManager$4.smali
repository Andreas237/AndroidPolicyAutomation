.class Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/Response$ErrorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->errorDestSiteListener()Lcom/android/volley/Response$ErrorListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V
    .locals 0

    .line 532
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$4;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onErrorResponse(Lcom/android/volley/VolleyError;)V
    .locals 4

    .line 535
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$4;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps errorDestSiteListener error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 536
    return-void
.end method
