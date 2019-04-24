.class Lo/djf$e;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/djf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic b:Lo/djf;


# direct methods
.method constructor <init>(Lo/djf;)V
    .locals 1

    .line 532
    iput-object p1, p0, Lo/djf$e;->b:Lo/djf;

    .line 533
    const-string v0, "TrafficMonitoringService-RecordThread"

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 534
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 537
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateTodayTraffic@RecordThread run"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 538
    iget-object v0, p0, Lo/djf$e;->b:Lo/djf;

    invoke-static {v0}, Lo/djf;->d(Lo/djf;)V

    .line 539
    return-void
.end method
