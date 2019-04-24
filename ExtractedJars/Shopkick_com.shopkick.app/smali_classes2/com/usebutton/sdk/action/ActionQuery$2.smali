.class Lcom/usebutton/sdk/action/ActionQuery$2;
.super Ljava/lang/Object;
.source "ActionQuery.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/action/ActionQuery;->setDateRange(Ljava/util/Date;Ljava/util/Date;)Lcom/usebutton/sdk/action/ActionQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/action/ActionQuery;

.field final synthetic val$startDate:Ljava/util/Date;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/action/ActionQuery;Ljava/util/Date;)V
    .locals 0

    .line 307
    iput-object p1, p0, Lcom/usebutton/sdk/action/ActionQuery$2;->this$0:Lcom/usebutton/sdk/action/ActionQuery;

    iput-object p2, p0, Lcom/usebutton/sdk/action/ActionQuery$2;->val$startDate:Ljava/util/Date;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 310
    iget-object v0, p0, Lcom/usebutton/sdk/action/ActionQuery$2;->this$0:Lcom/usebutton/sdk/action/ActionQuery;

    const-string v1, "applicable_date_range_start"

    iget-object v2, p0, Lcom/usebutton/sdk/action/ActionQuery$2;->val$startDate:Ljava/util/Date;

    invoke-static {v2}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->isoFormat(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/action/ActionQuery;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
