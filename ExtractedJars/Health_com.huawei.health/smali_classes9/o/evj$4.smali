.class Lo/evj$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/evj;->d(Landroid/os/Handler;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/evj;

.field final synthetic b:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lo/evj;Ljava/lang/Object;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lo/evj$4;->a:Lo/evj;

    iput-object p2, p0, Lo/evj$4;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 52
    iget-object v0, p0, Lo/evj$4;->a:Lo/evj;

    iget-object v1, p0, Lo/evj$4;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lo/evj;->a(Ljava/lang/Object;)V

    .line 53
    return-void
.end method
