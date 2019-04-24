.class Lo/cir$21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->a(Lo/cio;Lo/cin;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cio;

.field final synthetic b:Lo/cir;

.field final synthetic e:Lo/cin;


# direct methods
.method constructor <init>(Lo/cir;Lo/cio;Lo/cin;)V
    .locals 0

    .line 1711
    iput-object p1, p0, Lo/cir$21;->b:Lo/cir;

    iput-object p2, p0, Lo/cir$21;->a:Lo/cio;

    iput-object p3, p0, Lo/cir$21;->e:Lo/cin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1714
    iget-object v0, p0, Lo/cir$21;->a:Lo/cio;

    iget-object v1, p0, Lo/cir$21;->e:Lo/cin;

    invoke-virtual {v0, v1}, Lo/cio;->a(Lo/cin;)V

    .line 1715
    return-void
.end method
