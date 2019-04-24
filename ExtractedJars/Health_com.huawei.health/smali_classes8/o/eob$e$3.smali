.class Lo/eob$e$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eob$e;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eob$e;


# direct methods
.method constructor <init>(Lo/eob$e;)V
    .locals 0

    .line 1376
    iput-object p1, p0, Lo/eob$e$3;->c:Lo/eob$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1379
    iget-object v0, p0, Lo/eob$e$3;->c:Lo/eob$e;

    iget-object v0, v0, Lo/eob$e;->c:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->u()V

    .line 1380
    return-void
.end method
