.class Lcom/usebutton/sdk/internal/events/ReportPolicy$2;
.super Ljava/lang/Object;
.source "ReportPolicy.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/util/Publisher$Action;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/events/ReportPolicy;->publishShouldReport()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/util/Publisher$Action<",
        "Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/events/ReportPolicy;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/events/ReportPolicy;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy$2;->this$0:Lcom/usebutton/sdk/internal/events/ReportPolicy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public perform(Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;)V
    .locals 0

    .line 98
    invoke-interface {p1}, Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;->onShouldReport()V

    return-void
.end method

.method public bridge synthetic perform(Ljava/lang/Object;)V
    .locals 0

    .line 95
    check-cast p1, Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/events/ReportPolicy$2;->perform(Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;)V

    return-void
.end method
