.class Lo/bui$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic d:Lo/bui;


# direct methods
.method constructor <init>(Lo/bui;Ljava/lang/Object;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lo/bui$5;->d:Lo/bui;

    iput-object p2, p0, Lo/bui$5;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 52
    iget-object v0, p0, Lo/bui$5;->d:Lo/bui;

    iget-object v1, p0, Lo/bui$5;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 53
    return-void
.end method
