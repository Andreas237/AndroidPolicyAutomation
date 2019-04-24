.class Lo/enu$a$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enu$a;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/enu$a;


# direct methods
.method constructor <init>(Lo/enu$a;)V
    .locals 0

    .line 739
    iput-object p1, p0, Lo/enu$a$5;->a:Lo/enu$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 742
    iget-object v0, p0, Lo/enu$a$5;->a:Lo/enu$a;

    iget-object v0, v0, Lo/enu$a;->c:Lo/enu;

    invoke-virtual {v0}, Lo/enu;->k()V

    .line 743
    return-void
.end method
