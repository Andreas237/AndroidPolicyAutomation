.class Lo/cur$1$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cur$1;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cur$1;

.field final synthetic e:Ljava/util/HashMap;


# direct methods
.method constructor <init>(Lo/cur$1;Ljava/util/HashMap;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lo/cur$1$4;->a:Lo/cur$1;

    iput-object p2, p0, Lo/cur$1$4;->e:Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 51
    iget-object v0, p0, Lo/cur$1$4;->a:Lo/cur$1;

    iget-object v0, v0, Lo/cur$1;->d:Lo/cur;

    iget-object v1, p0, Lo/cur$1$4;->e:Ljava/util/HashMap;

    invoke-static {v0, v1}, Lo/cur;->d(Lo/cur;Ljava/util/HashMap;)V

    .line 52
    return-void
.end method
