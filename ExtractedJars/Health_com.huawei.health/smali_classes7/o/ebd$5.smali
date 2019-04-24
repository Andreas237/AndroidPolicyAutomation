.class final Lo/ebd$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ebd;->b(Landroid/os/Handler;Lo/ebd$b;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/os/Handler;

.field final synthetic c:Ljava/lang/String;

.field final synthetic e:Lo/ebd$b;


# direct methods
.method constructor <init>(Landroid/os/Handler;Lo/ebd$b;Ljava/lang/String;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lo/ebd$5;->b:Landroid/os/Handler;

    iput-object p2, p0, Lo/ebd$5;->e:Lo/ebd$b;

    iput-object p3, p0, Lo/ebd$5;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 201
    iget-object v0, p0, Lo/ebd$5;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/ebd$5;->e:Lo/ebd$b;

    iget-object v2, p0, Lo/ebd$5;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/ebd;->e(Landroid/os/Handler;Lo/ebd$b;Ljava/lang/String;)V

    .line 202
    return-void
.end method
