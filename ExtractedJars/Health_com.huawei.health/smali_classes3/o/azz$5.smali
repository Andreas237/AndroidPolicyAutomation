.class Lo/azz$5;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/azz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/azz;


# direct methods
.method constructor <init>(Lo/azz;)V
    .locals 0

    .line 535
    iput-object p1, p0, Lo/azz$5;->b:Lo/azz;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 539
    const-string v0, "PingModule"

    const-string v1, "receive valid ping action."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 541
    iget-object v0, p0, Lo/azz$5;->b:Lo/azz;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/azz;->d(Lo/azz;I)V

    .line 542
    return-void
.end method
